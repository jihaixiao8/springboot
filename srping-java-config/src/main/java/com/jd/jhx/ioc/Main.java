package com.jd.jhx.ioc;

import com.jd.jhx.ioc.config.JavaConfig;
import com.jd.jhx.ioc.service.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jihaixiao on 2016/11/9.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService = (UseFunctionService) context.getBean("useFunctionService");
        System.out.println(useFunctionService.sayHello("tingting"));
        context.close();

    }

}
