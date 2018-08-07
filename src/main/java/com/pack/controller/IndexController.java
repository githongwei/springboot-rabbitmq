package com.pack.controller;

import com.pack.indexmq.IndexSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Author zhaohongwei
 * @Date 2018/7/3 14:12
 * @Version 1.0
 **/
@RestController
public class IndexController {

    @Autowired
    private IndexSender indexSender;

    @GetMapping("/index")
    public String indexTest(){
        try {
            indexSender.send();
            return "yes";
        }catch (Exception e) {
            e.printStackTrace();
            return "no";
        }
    }

}
