package com.jd.jhx.resource.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by jihaixiao on 2016/11/12.
 */
@Service
public class DemoConfigService {

    @Value("${code.author}")
    private String author;

    public void add(){
        System.out.println("配置文件输出："+author);
    }

}
