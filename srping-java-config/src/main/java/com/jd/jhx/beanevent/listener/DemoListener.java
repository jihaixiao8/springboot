package com.jd.jhx.beanevent.listener;

import com.jd.jhx.beanevent.event.DemoEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by jihaixiao on 2016/11/12.
 */

@Component
public class DemoListener implements ApplicationListener<DemoEvent>{
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("我 LISTENER 接受到了 PUBLISHER 的消息："+msg);
    }
}
