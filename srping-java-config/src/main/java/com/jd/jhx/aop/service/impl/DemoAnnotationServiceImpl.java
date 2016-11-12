package com.jd.jhx.aop.service.impl;

import com.jd.jhx.aop.annotation.Loggable;
import com.jd.jhx.aop.service.DemoAnnotationService;
import org.springframework.stereotype.Service;

/**
 * Created by jihaixiao on 2016/11/12.
 */

@Service
public class DemoAnnotationServiceImpl implements DemoAnnotationService{

    @Loggable
    public void add() {
        System.out.println("demo annocation");
    }
}
