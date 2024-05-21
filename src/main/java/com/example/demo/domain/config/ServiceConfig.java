package com.example.demo.domain.config;

import com.example.demo.domain.repository.LogsRepository;
import com.example.demo.domain.service.LogsService;
import com.example.demo.web.controller.LogsController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
     @Bean
    public LogsController logsController(LogsService logsService){
        return new LogsController (logsService);
    }
}
