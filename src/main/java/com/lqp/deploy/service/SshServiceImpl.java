package com.lqp.deploy.service;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.stereotype.Service;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

/**
 * @ClassName: SshServiceImpl
 * @Description: ssh服务实现
 * @author longqingping
 * @date 2016年10月26日 下午2:16:33
 */
@Service
public class SshServiceImpl implements ISshService {

    @Override
    public String exec(String username, String host, int port, String password, String command) {
        JSch jsch = new JSch();
        try {
            Session session = jsch.getSession(username, host, port);

            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);

            session.setPassword(password);

            session.connect();

            Channel channel = session.openChannel("exec");
            ((ChannelExec) channel).setCommand("pwd");

            ((ChannelExec) channel).setErrStream(System.err);

            channel.setInputStream(null);

            InputStream in = channel.getInputStream();
            StringBuilder sb = new StringBuilder();

            channel.connect();
            byte[] tmp = new byte[1024];
            while (true) {
                while (in.available() > 0) {
                    int i = in.read(tmp, 0, 1024);
                    if (i < 0)
                        break;
                    sb.append(new String(tmp, 0, i));
                }
                if (channel.isClosed()) {
                    System.out.println("exit-status: " + channel.getExitStatus());
                    break;
                }
            }
            channel.disconnect();
            session.disconnect();
            return sb.toString();
        } catch (JSchException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
