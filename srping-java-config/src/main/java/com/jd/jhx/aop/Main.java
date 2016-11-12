package com.jd.jhx.aop;

import com.jd.jhx.aop.config.AopConfig;
import com.jd.jhx.aop.service.DemoAnnotationService;
import com.jd.jhx.aop.service.DemoMethodService;
import com.jd.jhx.aop.service.impl.DemoAnnotationServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jihaixiao on 2016/11/12.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoAnnotationService.add();
        demoMethodService.add();
        context.close();
    }

}
