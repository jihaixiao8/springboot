package com.jd.jhx.aware.service;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by jihaixiao on 2016/11/14.
 */

@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware{

    private String beanName;

    private ResourceLoader resourceLoader;

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void output() throws IOException {
        System.out.println("Bean 名称："+beanName);
        Resource resource = resourceLoader.getResource("classpath:common.properties");
        System.out.println("resource 加载文件内容："+ IOUtils.toString(resource.getInputStream()));
    }
}
