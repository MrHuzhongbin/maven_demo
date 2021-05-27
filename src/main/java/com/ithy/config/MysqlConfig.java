package com.ithy.config;

import com.alibaba.druid.pool.DruidDataSource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MysqlConfig {
    private DruidDataSource getDataSource(){
        try {
            InputStream resourceAsStream = MysqlConfig.class.getClassLoader().getResourceAsStream("mysql.properties");
            Properties properties = new Properties();
            properties.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
