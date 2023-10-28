package com.wp.controller;

import com.wp.config.PropertyConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description
 * @Author admin
 * @Date 2023/10/28 16:55
 */
@RestController
@RequestMapping
public class SdkApiController {

    @Resource
    private PropertyConfiguration propertyConfiguration;

    @GetMapping("/sdk-api")
    public String sdkApi() {
        return "Hello from SDK! My name is " +
                propertyConfiguration.getName() + "," + "and my age is " + propertyConfiguration.getAge();
    }
}
