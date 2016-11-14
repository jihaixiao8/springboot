package com.jd.jhx.schedule;

import com.jd.jhx.schedule.config.ScheduleConfig;
import com.jd.jhx.schedule.service.ScheduleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jihaixiao on 2016/11/14.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduleConfig.class);
//        ScheduleService scheduleService = context.getBean(ScheduleService.class);
    }

}
