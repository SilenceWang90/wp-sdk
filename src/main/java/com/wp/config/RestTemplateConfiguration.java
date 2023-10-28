package com.wp.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @Author admin
 * @Date 2023/10/28 17:34
 */
@Configuration
@ConditionalOnProperty(name = "sdk.rest-template.timeout.enabled", havingValue = "true")
public class RestTemplateConfiguration {
    @Bean
    public RestTemplate sdkRestTemplate() {
        System.out.println("我是SDK中的RestTemplate");
        // 创建 RestTemplate，根据配置设置超时时间等
        return new RestTemplate();
    }
}
