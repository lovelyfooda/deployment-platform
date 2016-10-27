package com.lqp.deploy.service;

/**
 * @ClassName: ISshService
 * @Description: ssh服务
 * @author longqingping
 * @date 2016年10月26日 下午2:15:30
 */
public interface ISshService {

    public String exec(String username, String host, int port, String password, String command);

}
