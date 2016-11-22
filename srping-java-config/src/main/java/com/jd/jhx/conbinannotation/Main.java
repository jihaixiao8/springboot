package com.jd.jhx.conbinannotation;

import com.jd.jhx.conbinannotation.config.DemoConfig;
import com.jd.jhx.conbinannotation.service.DemoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jihaixiao on 2016/11/22.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService demoService = context.getBean(DemoService.class);
        demoService.output();
        context.close();
    }

}
