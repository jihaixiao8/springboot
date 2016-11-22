package com.jd.jhx.conbinannotation.service;

import org.springframework.stereotype.Service;

/**
 * Created by jihaixiao on 2016/11/22.
 */

@Service
public class DemoService {

    public void output(){
        System.out.println("从组合注解获取BEAN。。");
    }
}
