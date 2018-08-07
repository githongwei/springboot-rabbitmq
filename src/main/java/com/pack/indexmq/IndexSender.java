package com.pack.indexmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName IndexSender
 * @Description TODO
 * @Author zhaohongwei
 * @Date 2018/7/3 9:40
 * @Version 1.0
 **/
@Component
public class IndexSender {

    @Autowired
    private AmqpTemplate rabbTemplate;

    public void send(){
        for (int i = 0;i <= 10000;i++){
            String content = "send:"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            this.rabbTemplate.convertAndSend("testMq",content+"-------"+i);
        }
    }
}
