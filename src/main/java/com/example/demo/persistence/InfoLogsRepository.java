package com.example.demo.persistence;

import com.example.demo.domain.LogsDomain;
import com.example.demo.domain.repository.LogsRepository;
import com.example.demo.persistence.crud.InfoLogsCrudRepository;
import com.example.demo.persistence.entity.InfoLogs;
import com.example.demo.persistence.mapper.LogsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.List;

@Component
public class InfoLogsRepository implements LogsRepository {
    @Autowired
    private InfoLogsCrudRepository infoLogsCrudRepository;
    @Autowired
    private LogsMapper mapper;

    @Override
    public List<LogsDomain> getAll(){
        List<InfoLogs> infoLogs = (List<InfoLogs>) infoLogsCrudRepository.findAll();
        System.out.println("HOLA"+infoLogs);
        System.out.println("Otro"+(List<InfoLogs>)infoLogsCrudRepository.findAll());
        return mapper.toLoges(infoLogs);

    }

//    public List<LogsDomain> getByTipo(String tipo) {
//        List<InfoLogs> infoLogs = (List<InfoLogs>) infoLogsCrudRepository.findByTipo(tipo);
//        return mapper.toLoges(infoLogs);
//    }
//
//    public List<LogsDomain> getByFecha(Timestamp fecha) {
//        List<InfoLogs> infoLogs = infoLogsCrudRepository.findByFecha(fecha);
//        return mapper.toLoges(infoLogs);
//    }

    }