package com.lqp.deploy.repository;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.lqp.deploy.entity.Server;

/**
 * @ClassName: IServerRepository
 * @Description:
 * @author longqingping
 * @date 2016年10月18日 下午5:59:34
 */
public interface IServerRepository {

    @Select("SELECT * FROM test.t_server")
    public List<Server> select();

}
