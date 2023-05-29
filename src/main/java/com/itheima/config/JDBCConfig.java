package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class JDBCConfig {

    @Bean("dataSource")
    public static DruidDataSource getDataSource(){
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://192.168.11.130/spring_db");
        ds.setUsername("root");
        ds.setPassword("ckns818");

        return ds;
    }
}
