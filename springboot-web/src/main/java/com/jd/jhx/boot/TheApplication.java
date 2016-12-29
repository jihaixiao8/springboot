package com.jd.jhx.boot;

import com.jd.jhx.mvc.domain.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jihaixiao on 2016/12/29.
 */
@Controller
@SpringBootApplication
public class TheApplication {

    @RequestMapping("/threaf")
    public String index(Model model){
        Person person = new Person();
        person.setAge(12);
        person.setName("curry");
        model.addAttribute("singlePerson",person);
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(TheApplication.class);
    }

}
