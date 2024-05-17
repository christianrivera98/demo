package com.example.demo.web.controller;

import com.example.demo.domain.LogsDomain;

import com.example.demo.domain.service.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/logs")
public class LogsController {
    @Autowired
    private LogsService logsService;

    public List<LogsDomain> getAll(){
        return logsService.getAll();
    }

    public List<LogsDomain> getByTipo(String logType){
        return logsService.getByTipo(logType);
    }

    public List<LogsDomain> getByFecha(Timestamp fechaEnvio){
        return logsService.getByFecha(fechaEnvio);
    }
}
