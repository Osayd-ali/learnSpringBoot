package com.spring.learnSpringBoot;
//Creating Rest api controller for Currency Configuration

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyConfigurationController {
    // Currency Configuration
    // CurrencyConfiguration: url, username, key
    @Autowired
    private CurrencyServiceConfiguration configuration;
    @RequestMapping("/currency-service")
    public CurrencyServiceConfiguration retrieveCurrency() {
        return configuration;
    }
}