package com.ins.dd.demo.httpRequest;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class OkApiScheduling {
    private int count=0;

    @Scheduled(cron="0/10 * * * * ?")
    private void process(){
        System.out.println("this is scheduler task runing  "+(count++));
        HttpQuery h = new HttpQuery();
        String a = h.getOkApiBtc();
        System.out.println(a);
    }
}
