package com.lqp.deploy.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: AppConfig
 * @Description: AppConfig
 * @author longqingping
 * @date 2016年10月13日 下午5:11:13
 */
@Configuration
@ComponentScan(basePackages = "com.lqp.deploy.controller")
public class AppConfig {

}
