package com.jd.test.setting;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by jihaixiao on 2016/12/28.
 */

@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {

    private static final String MSG = "world";

    private String msg = MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
