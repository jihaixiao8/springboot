package com.jd.jhx.resource.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by jihaixiao on 2016/11/12.
 */
@Configuration
@ComponentScan("com.jd.jhx.resource")
@PropertySource("classpath:common.properties")
public class ELConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigure(){
        return new PropertySourcesPlaceholderConfigurer();
    }

}
