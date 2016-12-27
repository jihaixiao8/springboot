package com.jd.jhx.boot.setting;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by jihaixiao on 2016/12/27.
 */
@Component
@ConfigurationProperties(prefix = "author")
public class AuthorSettings {

    private String name;

    private Long age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
