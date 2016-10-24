package com.lqp.deploy.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @ClassName: ApplicationProperties
 * @Description: 应用程序配置
 * @author longqingping
 * @date 2016年10月18日 下午4:41:57
 */
@Configuration
// @ImportResource("classpath:application.properties")
@PropertySource("classpath:application.properties")
public class ApplicationProperties {

    @Value("${jdbc.driverClassName}")
    public String driverClassName;
    @Value("${jdbc.url}")
    public String url;
    @Value("${jdbc.username}")
    public String username;
    @Value("${jdbc.password}")
    public String password;
    @Value("${jdbc.initialSize}")
    public int initialSize;
    @Value("${jdbc.maxActive}")
    public int maxActive;
    @Value("${jdbc.minIdle}")
    public int minIdle;
    @Value("${jdbc.maxIdle}")
    public int maxIdle;

}
