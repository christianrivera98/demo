package com.example.demo.domain.repository;

import com.example.demo.domain.LogsDomain;


import java.sql.Timestamp;
import java.util.List;

public interface LogsRepository {
    List<LogsDomain> getAll();
//    List<LogsDomain> getByTipo(String tipo);
//    List<LogsDomain> getByFecha(Timestamp fecha);

}