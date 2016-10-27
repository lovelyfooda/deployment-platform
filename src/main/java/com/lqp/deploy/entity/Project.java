package com.lqp.deploy.entity;

import java.util.List;

/**
 * @ClassName: Project
 * @Description: 项目实体
 * @author longqingping
 * @date 2016年10月26日 上午10:19:38
 */
public class Project {

    private Long id;
    private String name;// 项目名称
    private Integer type;// 0 jar 1 war
    private String description;// 项目描述

    // 对象属性
    private List<Server> servers;
    private List<Package> packages;
    private List<DeploymentOperations> deployOps;

    public List<DeploymentOperations> getDeployOps() {
        return deployOps;
    }

    public void setDeployOps(List<DeploymentOperations> deployOps) {
        this.deployOps = deployOps;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Server> getServers() {
        return servers;
    }

    public void setServers(List<Server> servers) {
        this.servers = servers;
    }

    public List<Package> getPackages() {
        return packages;
    }

    public void setPackages(List<Package> packages) {
        this.packages = packages;
    }

}
