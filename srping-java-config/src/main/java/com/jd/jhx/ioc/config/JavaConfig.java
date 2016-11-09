package com.jd.jhx.ioc.config;

import com.jd.jhx.ioc.service.FunctionService;
import com.jd.jhx.ioc.service.UseFunctionService;
import com.jd.jhx.ioc.service.impl.FunctionServiceImpl;
import com.jd.jhx.ioc.service.impl.UseFunctionServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jihaixiao on 2016/11/9.
 */

@Configuration
public class JavaConfig {

    @Bean
    public FunctionService functionService(){
        return new FunctionServiceImpl();
    }

    @Bean
    public UseFunctionService useFunctionService(){
        UseFunctionServiceImpl useFunctionService = new UseFunctionServiceImpl();
        useFunctionService.setFunctionService(functionService());
        return useFunctionService;
    }

}
