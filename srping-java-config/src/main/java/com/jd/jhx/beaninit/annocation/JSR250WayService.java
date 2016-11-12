package com.jd.jhx.beaninit.annocation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by jihaixiao on 2016/11/12.
 */
public class JSR250WayService {

    @PostConstruct
    public void init(){
        System.out.println("@JSR250WayService.init@");
    }

    public JSR250WayService() {
        System.out.println("JSR250 constructor method run...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("@JSR250WayService.destroy@");
    }
}
