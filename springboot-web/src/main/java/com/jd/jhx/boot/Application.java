package com.jd.jhx.boot;

import com.jd.jhx.boot.setting.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chujinting on 2016/11/5.
 */

@RestController
@SpringBootApplication
public class Application {

   @Autowired
   private AuthorSettings authorSettings;

    @RequestMapping("/")
    public String home(){
        try {
            String s = "s";
            return "hello";
        } finally {
            System.out.println("hahah"+authorSettings.getName()+":"+authorSettings.getAge());
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
