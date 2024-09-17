package com.ecommerce.ProductCatalogService.configurations;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
/*
*   Spring bean config file
 */
@Configuration
public class RestTemplateConfiguration {

    @Bean
    public RestTemplate getRestTemplate() {
        return  new RestTemplateBuilder().build();
    }
}
