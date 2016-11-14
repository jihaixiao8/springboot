package com.jd.jhx.aware;

import com.jd.jhx.aware.config.AwareConfig;
import com.jd.jhx.aware.service.AwareService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * Created by jihaixiao on 2016/11/14.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService = context.getBean(AwareService.class);
        awareService.output();
        context.close();
    }

}
