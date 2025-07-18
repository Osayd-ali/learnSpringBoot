package com.spring.learnSpringBoot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//currency-service.url=
//currency-service.username=
//currency-service.key=
//Creating a configuration class for CurrencyService
@ConfigurationProperties(prefix = "currency-service")
@Component
public class CurrencyServiceConfiguration{
    private String url;
    private String username;
    private String key;

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    @Override
    public String toString() {
        return "CurrencyServiceConfiguration [url: " + url + '\'' + ", username: " + username + '\'' + ", key: " + key + "]";
    }
}