package com.lqp.deploy.repository;

import java.util.List;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lqp.deploy.entity.Server;

/**
 * @ClassName: ServerRepositoryTest
 * @Description: TODO
 * @author Administrator
 * @date 2016年10月19日 下午5:56:06
 */
public class ServerRepositoryTest {

    private static ApplicationContext ctx = null;

    @BeforeClass
    public static void before() {
        ctx = new AnnotationConfigApplicationContext(com.lqp.deploy.spring.ApplicationContext.class);
    }

    @After
    public void after() {
    }

    // @Test
    // public void accesstokenTest() throws ClientProtocolException, IOException
    // {
    // IDemoService demoService = ctx.getBean(IDemoService.class);
    // demoService.accesstoken();
    // }

    @Test
    public void select() {
        IServerRepository repository = ctx.getBean(IServerRepository.class);
        List<Server> list = repository.select();
        System.out.println("id==========================" + list.size());
    }

}
