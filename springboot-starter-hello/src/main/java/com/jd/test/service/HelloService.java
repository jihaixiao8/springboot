package com.jd.test.service;

/**
 * Created by jihaixiao on 2016/12/28.
 */
public class HelloService {

    private String msg;

    public String sayHello(){
        return "Hello:"+msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
