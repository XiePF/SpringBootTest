package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Descripition:
 * @Author: xiepf
 * @Date: 2017/9/23 16:52
 */
@RestController("/test")
public class Test {

    @RequestMapping("/hi")
    public  String hello()
    {
        //
        return  "hello world";
    }
}
