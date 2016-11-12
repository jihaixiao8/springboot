package com.jd.jhx.beaninit;

import com.jd.jhx.beaninit.annocation.JSR250WayService;
import com.jd.jhx.beaninit.config.PrePostConfig;
import com.jd.jhx.beaninit.javaconfig.BeanWayService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jihaixiao on 2016/11/12.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
        context.close();
    }

}
