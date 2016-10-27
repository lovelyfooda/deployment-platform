package com.lqp.deploy.service;

import org.springframework.stereotype.Service;

import com.lqp.deploy.entity.Server;

/**
 * @ClassName: ServerServiceImpl
 * @Description:
 * @author longqingping
 * @date 2016年10月25日 下午6:54:15
 */
@Service
public class ServerServiceImpl implements IServerService {

    @Override
    public boolean addServer(Server server) {
        server = new Server();
        server.setId(1L);
        server.setHostName("java11");
        server.setIp("");
        return false;
    }

}
