package com.bugu.sleep_cycle.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mcbbugu
 * 2021-03-03 22:41
 */
@RestController
public class LoginApi {

    //测试
    @GetMapping("/test")
    public String test(){
        return "123sdsdasdassss";
    }
}