package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Descripition:
 * @Author: xiepfd
 * @Date: 2017/9/23 16:52
 */
@RestController
@RequestMapping("/test")
public class Test {

    @RequestMapping("/hi")
    public  String hello()
    {
        //
        return  "hia !";
    }
}
