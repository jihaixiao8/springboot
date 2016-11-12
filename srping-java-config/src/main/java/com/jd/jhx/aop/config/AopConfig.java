package com.jd.jhx.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by jihaixiao on 2016/11/12.
 */

@Configuration
@ComponentScan("com.jd.jhx.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
