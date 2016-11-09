package com.jd.jhx.ioc.service.impl;

import com.jd.jhx.ioc.service.FunctionService;
import com.jd.jhx.ioc.service.UseFunctionService;

/**
 * Created by jihaixiao on 2016/11/9.
 */
public class UseFunctionServiceImpl implements UseFunctionService{

    private FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }


    @Override
    public String sayHello(String word) {
        return functionService.sayHello(word);
    }
}
