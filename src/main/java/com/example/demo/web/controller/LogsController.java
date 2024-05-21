package com.example.demo.web.controller;

import com.example.demo.domain.LogsDomain;

import com.example.demo.domain.service.LogsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/logs")
public class LogsController {

    private final LogsService logsService;


    @GetMapping("/all")
    public ResponseEntity <List<LogsDomain> > getAll(){
        return ResponseEntity.ok(logsService.getAll());
    }

//    public List<LogsDomain> getByTipo(String logType){
//        return logsService.getByTipo(logType);
//    }
//
//    public List<LogsDomain> getByFecha(Timestamp fechaEnvio){
//        return logsService.getByFecha(fechaEnvio);
//    }
}
