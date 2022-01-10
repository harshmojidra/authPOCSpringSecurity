package com.hmojidra.candidateBackend.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer {

    @Value("${allowed.origins}")
    private String[] allowOrigins;


    @Override
    public void addCorsMappings(CorsRegistry cors) {

        cors.addMapping("/**");
    }
}
