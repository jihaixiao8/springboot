package com.jd.jhx.mvc.controller;

import com.jd.jhx.common.constants.ErrorCode;
import com.jd.jhx.common.exception.CheckException;
import com.jd.jhx.mvc.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jihaixiao on 2016/11/29.
 */

@Controller
public class AdviceController {

    @RequestMapping("/advice")
    public String getSomeThing(@ModelAttribute("msg") String msg, DemoObj obj){
        throw new CheckException(ErrorCode.PARAMETER_EMPTY,msg);
    }




}
