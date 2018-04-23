package com.springmvc.demo.service.serviceImpl;

import com.springmvc.demo.service.MyTestSpringTimer;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;


@Service("myTestSpringTimer")
public class MyTestSpringTimerImpl implements MyTestSpringTimer {
 
    
    private int k = 0 ;
    
    @Scheduled(cron="0/3 * *  * * ? ")   //每3秒执行一次 
    public void testTimer() {
       k++;
       System.out.println("第"+k+"执行定时任务");
        
    }

    @Override
    public void getInfo() {
       System.out.println("--------------Get------------------");
    }

}
