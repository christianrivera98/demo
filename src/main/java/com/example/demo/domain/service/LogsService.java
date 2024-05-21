package com.example.demo.domain.service;

import com.example.demo.domain.LogsDomain;
import com.example.demo.domain.repository.LogsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.sql.Timestamp;
import java.util.List;

@RequiredArgsConstructor
@Service
public class LogsService {

    private final LogsRepository logsRepository;

//    public LogsService(LogsRepository logsRepository) {
//        this.logsRepository = logsRepository;
//    }

    public List<LogsDomain> getAll(){
        return logsRepository.getAll();
    }

//    public  List<LogsDomain> getByTipo(String logType){
//        return logsRepository.getByTipo(logType);
//    }
//
//    public List<LogsDomain> getByFecha(Timestamp fechaEnvio){
//        return logsRepository.getByFecha(fechaEnvio);
//    }
}
