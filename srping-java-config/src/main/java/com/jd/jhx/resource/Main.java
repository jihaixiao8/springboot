package com.jd.jhx.resource;

import com.jd.jhx.resource.config.ELConfig;
import com.jd.jhx.resource.service.DemoConfigService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jihaixiao on 2016/11/12.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(ELConfig.class);
        DemoConfigService demoConfigService = context.getBean(DemoConfigService.class);
        demoConfigService.add();
        context.close();
    }

}
