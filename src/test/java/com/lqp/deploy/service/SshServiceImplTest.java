package com.lqp.deploy.service;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: SshServiceImplTest
 * @Description: TODO
 * @author Administrator
 * @date 2016年10月26日 下午3:00:18
 */
public class SshServiceImplTest {

    private static ApplicationContext ctx = null;

    @BeforeClass
    public static void before() {
        ctx = new AnnotationConfigApplicationContext(com.lqp.deploy.spring.ApplicationContext.class);
    }

    @After
    public void after() {
    }

    @Test
    public void execTest() {
        SshServiceImpl sshService = (SshServiceImpl) ctx.getBean("sshServiceImpl");
        String result = sshService.exec("root", "10.0.200.59", 22, "123456", "pwd");
        System.out.println(result);
    }

}
