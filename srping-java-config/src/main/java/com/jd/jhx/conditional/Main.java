package com.jd.jhx.conditional;

import com.jd.jhx.conditional.config.ConditionConfig;
import com.jd.jhx.conditional.service.ListService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jihaixiao on 2016/11/22.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name")+"系统下的列表命令为："+listService.showListCmd());
    }

}
