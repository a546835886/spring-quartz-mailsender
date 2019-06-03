package com.batch;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AnnotationJob {

    @Scheduled(cron = "0/2 * * * * ?")
    public void excute(){
        System.out.println("AnnotationJob 执行 2秒1次");
    }
}
