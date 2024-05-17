package com.example.demo.persistence.crud;

import com.example.demo.persistence.entity.InfoLogs;
import org.springframework.data.repository.CrudRepository;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

public interface InfoLogsCrudRepository extends CrudRepository<InfoLogs, UUID> {
    List<InfoLogs> findByTipo (String tipo);
    List<InfoLogs> findByFecha(Timestamp fecha);
}

