package com.batch;

import org.quartz.JobExecutionContext;

public class CronJob {
    public void execute(){
        System.out.println("定时任务执行...每1秒执行一次");
    }
}
