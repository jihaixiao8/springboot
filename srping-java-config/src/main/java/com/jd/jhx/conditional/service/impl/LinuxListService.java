package com.jd.jhx.conditional.service.impl;

import com.jd.jhx.conditional.service.ListService;

/**
 * Created by jihaixiao on 2016/11/22.
 */
public class LinuxListService implements ListService{
    @Override
    public String showListCmd() {
        return "ls";
    }
}
