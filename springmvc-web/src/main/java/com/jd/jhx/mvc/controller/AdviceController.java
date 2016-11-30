package com.jd.jhx.mvc.controller;

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
        throw new IllegalArgumentException("非常抱歉，参数有误/"+"来自@ModelAttribiute:"+msg+",id="+obj.getId());
    }

}
