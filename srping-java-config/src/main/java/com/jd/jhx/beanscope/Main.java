package com.jd.jhx.beanscope;

import com.jd.jhx.beanscope.config.ScopeConfig;
import com.jd.jhx.beanscope.service.DemoProtoTypeService;
import com.jd.jhx.beanscope.service.DemoSingletonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jihaixiao on 2016/11/12.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService s2 = context.getBean(DemoSingletonService.class);

        DemoProtoTypeService p1 = context.getBean(DemoProtoTypeService.class);
        DemoProtoTypeService p2 = context.getBean(DemoProtoTypeService.class);

        System.out.println("s1 is equals s2 :"+(s1 == s2));
        System.out.println("p1 is equals p2 :"+(p1 == p2));
    }
}
