package com.manning.readinglist.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("test")
public class TestProps {
    private boolean allowX;

    public void setAllowX(boolean allowX){
        this.allowX = allowX;
    }

    public boolean isAllowX(){
        return allowX;
    }
}
