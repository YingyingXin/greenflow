package com.laioffer.SecondHandMarket;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;


public class ApplicationConfig {

    @Bean(name = "dataSource")
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("");
        dataSource.setUsername("");
        dataSource.setPassword("");

        return dataSource;
    }
}
