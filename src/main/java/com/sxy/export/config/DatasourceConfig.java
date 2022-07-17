package com.sxy.export.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Author ShuXinYuan  舒新元
 * @Date 2022/07/17 --星期日  上午 10:36
 **/


@Configuration
public class DatasourceConfig {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DruidDataSource getDataSource(){
        return new DruidDataSource();
    }

}
