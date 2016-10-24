package com.lqp.deploy.spring;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

/**
 * @ClassName: PersistenceConfig
 * @Description: 数据持久化配置
 * @author longqingping
 * @date 2016年10月18日 下午4:20:10
 */
@Configuration
public class PersistenceConfig {

    @Bean
    public DataSource dataSource(ApplicationProperties pro) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(pro.driverClassName);
        dataSource.setUrl(pro.url);
        dataSource.setUsername(pro.username);
        dataSource.setPassword(pro.password);
        dataSource.setInitialSize(pro.initialSize);
        dataSource.setMaxActive(pro.maxActive);
        dataSource.setMaxIdle(pro.maxIdle);
        dataSource.setMinIdle(pro.minIdle);
        return dataSource;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource);
        sqlSessionFactory.setConfigLocation(new ClassPathResource("mybatis/SqlMapConfig.xml"));
        return sqlSessionFactory;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapper = new MapperScannerConfigurer();
        mapper.setBasePackage("com.lqp.deploy");
        return mapper;
    }

}
