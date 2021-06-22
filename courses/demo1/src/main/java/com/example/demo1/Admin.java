package com.example.demo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myapi")
public class Admin {

    @RequestMapping("f1")
    public String getFn1(){
        return "";
    }

    @RequestMapping("f2")
    public String getFn2(){
        return "";
    }

}
