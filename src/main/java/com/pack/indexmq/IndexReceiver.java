package com.pack.indexmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName IndexSender
 * @Description TODO
 * @Author zhaohongwei
 * @Date 2018/7/3 9:44
 * @Version 1.0
 **/
@Component
@RabbitListener(queues = "testMq")
public class IndexReceiver {

    @RabbitHandler
    public void process(String index){
        System.out.println("Receiver:"+index);
    }

}
