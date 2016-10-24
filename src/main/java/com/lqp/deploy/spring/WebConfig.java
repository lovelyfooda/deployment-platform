package com.lqp.deploy.spring;

import java.util.List;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @ClassName: WebConfig
 * @Description: WebConfig
 * @author longqingping
 * @date 2016年10月13日 下午5:11:53
 */
// @Configuration
// @EnableWebMvc
// @ComponentScan(basePackages = "com.lqp.deploy.controller")
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // super.addViewControllers(registry);
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        // MediaType type = new
        // MediaType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        // List<MediaType> supportedMediaTypes = new ArrayList<MediaType>();
        // supportedMediaTypes.add(type);
        // StringHttpMessageConverter converter = new
        // StringHttpMessageConverter();
        // converter.setSupportedMediaTypes(supportedMediaTypes);
        // converters.add(converter);
    }

}
