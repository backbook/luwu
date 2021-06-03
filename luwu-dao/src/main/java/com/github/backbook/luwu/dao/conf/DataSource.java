package com.github.backbook.luwu.dao.conf;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
@Primary
@Component
public class DataSource extends DruidDataSource {

}