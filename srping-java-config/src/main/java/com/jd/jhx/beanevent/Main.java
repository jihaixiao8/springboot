package com.jd.jhx.beanevent;

import com.jd.jhx.beanevent.config.EventConfig;
import com.jd.jhx.beanevent.publisher.DemoPublisher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jihaixiao on 2016/11/12.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher publisher = context.getBean(DemoPublisher.class);
        publisher.publish("tingtingdafu");
        context.close();
    }

}
