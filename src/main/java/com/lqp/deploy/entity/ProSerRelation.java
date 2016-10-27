package com.lqp.deploy.entity;

/**
 * @ClassName: ProSerRelation
 * @Description:
 * @author longqingping
 * @date 2016年10月26日 上午10:29:20
 */
public class ProSerRelation {

    private Long projectId;// 项目ID
    private Long ServerId;// 服务器ID

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getServerId() {
        return ServerId;
    }

    public void setServerId(Long serverId) {
        ServerId = serverId;
    }

}
