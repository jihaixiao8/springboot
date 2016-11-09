package com.jd.jhx.ioc.service.impl;

import com.jd.jhx.ioc.service.FunctionService;

/**
 * Created by jihaixiao on 2016/11/9.
 */
public class FunctionServiceImpl implements FunctionService{
    @Override
    public String sayHello(String word) {
        return "hello "+word+" !!";
    }
}
