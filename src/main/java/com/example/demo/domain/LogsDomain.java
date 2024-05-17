package com.example.demo.domain;

import java.sql.Timestamp;
import java.util.UUID;

public class LogsDomain {

    private UUID logsId;
    private String logType;
    private String project;
    private Timestamp fechaEnvio;

    public UUID getLogsId() {
        return logsId;
    }

    public void setLogsId(UUID logsId) {
        this.logsId = logsId;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public Timestamp getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Timestamp fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }
}
