package com.lqp.deploy.entity;

import org.springframework.stereotype.Repository;

/**
 * @ClassName: Server
 * @Description: 服务器实体
 * @author longqingping
 * @date 2016年10月18日 下午4:16:01
 */
@Repository
public class Server {

    private Long id;
    private String hostName;// 主机名
    private String ip;// ip地址
    private String type;// 所属环境
    private String describe;// 描述
    private Long secretId; // 使用的秘钥ID

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Long getSecretId() {
        return secretId;
    }

    public void setSecretId(Long secretId) {
        this.secretId = secretId;
    }

}
