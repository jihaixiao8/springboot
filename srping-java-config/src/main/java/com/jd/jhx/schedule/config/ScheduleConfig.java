package com.jd.jhx.schedule.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by jihaixiao on 2016/11/14.
 */

@Configuration
@ComponentScan("com.jd.jhx.schedule")
@EnableScheduling
public class ScheduleConfig {
}
