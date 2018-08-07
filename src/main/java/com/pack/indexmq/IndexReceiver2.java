package com.pack.indexmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName IndexReceiver2
 * @Description TODO
 * @Author zhaohongwei
 * @Date 2018/8/2 9:43
 * @Version 1.0
 **/
@Component
@RabbitListener(queues = "testMq")
public class IndexReceiver2 {

    @RabbitHandler
    public void process(String index){
        System.out.println("Receiver2:"+index);
    }

}
