package com.wp.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author admin
 * @Date 2023/10/28 16:58
 */
@Component
@ConfigurationProperties(prefix = "wp-sdk.property")
@Data
@PropertySource("classpath:wp-sdk.properties")
public class PropertyConfiguration {
    private String name;
    private Long age;
}
