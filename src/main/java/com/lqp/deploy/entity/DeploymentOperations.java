package com.lqp.deploy.entity;

/**
 * @ClassName: DeploymentOperations
 * @Description: 部署操作实体
 * @author longqingping
 * @date 2016年10月26日 上午10:35:16
 */
public class DeploymentOperations {

    private Long id;// 发布操作ID
    private Long projectId;// 项目ID
    private Long packageId;// 发布包ID
    private Long serverId;// 服务器ID
    private String time;// 发布操作时间
    private Integer isSucceed;// 发布是否成功 0 succeed 1 fault
    private String log;// 发布控制台日志

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getPackageId() {
        return packageId;
    }

    public void setPackageId(Long packageId) {
        this.packageId = packageId;
    }

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getIsSucceed() {
        return isSucceed;
    }

    public void setIsSucceed(Integer isSucceed) {
        this.isSucceed = isSucceed;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

}
