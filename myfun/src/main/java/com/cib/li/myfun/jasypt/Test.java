package com.cib.li.myfun.jasypt;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties("myfun")
@Configuration
public class Test {
    String a;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
}
