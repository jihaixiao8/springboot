package com.jd.jhx.beaninit.config;

import com.jd.jhx.beaninit.annocation.JSR250WayService;
import com.jd.jhx.beaninit.javaconfig.BeanWayService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jihaixiao on 2016/11/12.
 */

@Configuration
public class PrePostConfig {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }

}
