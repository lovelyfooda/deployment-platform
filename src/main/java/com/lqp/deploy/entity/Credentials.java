package com.lqp.deploy.entity;

/**
 * @ClassName: Credentials
 * @Description: 凭证实体
 * @author longqingping
 * @date 2016年10月25日 下午6:49:52
 */
public class Credentials {

    private Long id;
    private String name;// 认证名称
    private String userName;// 登录用户名
    private String password;// 登录密码
    private String secretKey;// 私钥
    private String description;// 描述

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
