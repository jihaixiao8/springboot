package com.jd.jhx.schedule.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by jihaixiao on 2016/11/14.
 */

@Service
public class ScheduleService {

    private SimpleDateFormat format = new SimpleDateFormat("yyy-MM-dd:HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void fixedTask(){
        System.out.println("每5秒执行一次，当前时间："+format.format(new Date()));
    }

}
