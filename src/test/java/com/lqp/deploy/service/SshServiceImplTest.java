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
        String result = sshService.exec("ecjava", "192.168.1.101", 932, "E:\\ecjava", "sudo /ec/apps/global-id/script/stop.sh", 1);
        // System.out.println(result);
    }

}
