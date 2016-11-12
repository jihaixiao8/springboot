package com.jd.jhx.aop.service.impl;

import com.jd.jhx.aop.service.DemoMethodService;
import org.springframework.stereotype.Service;

/**
 * Created by jihaixiao on 2016/11/12.
 */

@Service
public class DemoMethodServiceImpl implements DemoMethodService{
    @Override
    public void add() {
        System.out.println(" demo method ");
    }
}
