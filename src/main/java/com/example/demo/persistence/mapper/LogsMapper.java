package com.example.demo.persistence.mapper;

import com.example.demo.domain.LogsDomain;
import com.example.demo.persistence.entity.InfoLogs;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LogsMapper {

  @Mappings({
          @Mapping(source = "identificador", target = "logId"),
          @Mapping(source = "tipo", target = "logType"),
          @Mapping(source = "proyecto", target = "project"),
          @Mapping(source = "fechaEnvio", target = "date"),

  })
  LogsDomain toLogs(InfoLogs infoLogs);
  List<LogsDomain> toLoges(List<InfoLogs> loges);
}

