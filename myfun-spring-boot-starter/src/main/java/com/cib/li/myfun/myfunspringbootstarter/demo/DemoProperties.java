package com.cib.li.myfun.myfunspringbootstarter.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;

@ConfigurationProperties(prefix = "myfun.demo")
public class DemoProperties {
    /**
     * Whether to enable myfun.demo.
     */
    private boolean enabled = true;
    private static final Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;
    private List<String> aList = new ArrayList<>(Collections.singletonList("string1"));

    private Charset defaultEncoding = DEFAULT_CHARSET;

    /**
     * Additional properties.
     */
    private final Map<String, String> properties = new HashMap<>();


    public Charset getDefaultEncoding() {
        return defaultEncoding;
    }

    public void setDefaultEncoding(Charset defaultEncoding) {
        this.defaultEncoding = defaultEncoding;
    }

    public List<String> getaList() {
        return aList;
    }

    public void setaList(List<String> aList) {
        this.aList = aList;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Map<String, String> getProperties() {
        return properties;
    }
}
