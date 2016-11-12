package com.jd.jhx.beanevent.publisher;

import com.jd.jhx.beanevent.event.DemoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by jihaixiao on 2016/11/12.
 */
@Component
public class DemoPublisher {

    @Autowired
    ApplicationContext context;

    public void publish(String msg){
        context.publishEvent(new DemoEvent(this,msg));
    }

}
