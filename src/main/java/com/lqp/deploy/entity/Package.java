package com.lqp.deploy.entity;

import java.util.List;

/**
 * @ClassName: Package
 * @Description: 项目包实体
 * @author longqingping
 * @date 2016年10月26日 上午10:45:08
 */
public class Package {

    private Long id;// 发布包ID
    private String name;// 发布包名称
    private Long projectId;// 项目ID
    private String time;// 上传时间

    // 对象属性
    private List<DeploymentOperations> deployOps;

    public List<DeploymentOperations> getDeployOps() {
        return deployOps;
    }

    public void setDeployOps(List<DeploymentOperations> deployOps) {
        this.deployOps = deployOps;
    }

    private String description;// 发布包描述：版本等信息

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

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
