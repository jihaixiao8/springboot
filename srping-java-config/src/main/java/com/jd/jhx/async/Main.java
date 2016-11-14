package com.jd.jhx.async;

import com.jd.jhx.async.config.TaskExecutorConfig;
import com.jd.jhx.async.service.AsyncTaskService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jihaixiao on 2016/11/14.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
        for (int i=0;i<10;i++){
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }
        context.close();
    }

}
