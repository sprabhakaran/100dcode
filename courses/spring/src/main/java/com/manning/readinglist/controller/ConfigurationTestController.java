package com.manning.readinglist.controller;

import com.manning.readinglist.config.TestProps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class ConfigurationTestController {
    private TestProps testProps;

    @Autowired
    public ConfigurationTestController(TestProps props){
        this.testProps = props;
    }

    @RequestMapping(value = "allowx", method = RequestMethod.GET)
    public boolean isAllowX(){
        return testProps.isAllowX();
    }
}
