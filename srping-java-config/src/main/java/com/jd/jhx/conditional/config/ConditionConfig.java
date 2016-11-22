package com.jd.jhx.conditional.config;

import com.jd.jhx.conditional.condition.LinuxCondition;
import com.jd.jhx.conditional.condition.MacOSCondition;
import com.jd.jhx.conditional.condition.WindowsCondition;
import com.jd.jhx.conditional.service.ListService;
import com.jd.jhx.conditional.service.impl.LinuxListService;
import com.jd.jhx.conditional.service.impl.MacOSListService;
import com.jd.jhx.conditional.service.impl.WindowsListService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jihaixiao on 2016/11/22.
 */

@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListService(){
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxListService(){
        return new LinuxListService();
    }

    @Bean
    @Conditional(MacOSCondition.class)
    public ListService macOSListService(){
        return new MacOSListService();
    }
}
