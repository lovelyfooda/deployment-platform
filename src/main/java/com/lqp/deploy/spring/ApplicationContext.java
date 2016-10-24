package com.lqp.deploy.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ClassName: ApplicationContext
 * @Description: spring容器类
 * @author longqingping
 * @date 2016年10月18日 下午5:01:35
 */
@Configuration
@Import({ ApplicationProperties.class, PersistenceConfig.class })
@ComponentScan(basePackages = "com.lqp.deploy")
public class ApplicationContext {

}
