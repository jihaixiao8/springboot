package com.jd.jhx.beaninit.javaconfig;

/**
 * Created by jihaixiao on 2016/11/12.
 */
public class BeanWayService {

    public void init(){
        System.out.println("@BeanWayService.init@");
    }

    public BeanWayService() {
        System.out.println("construtor method run...");
    }

    public void destroy(){
        System.out.println("@@BeanWayService.destroy");
    }
}
