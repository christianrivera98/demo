package com.example.demo.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.UUID;

@Setter
@Getter
@Entity
@Table(name= "info_logs")
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class InfoLogs {
    @Id
    @Column(name = "logId", updatable = false, nullable = false)
    @Convert(converter = UUIDConverter.class)
    private UUID identificador;

    @Column(name = "logType")
    private String tipo;

//    @Column(name = "fechaEnvio")
    private Timestamp fechaEnvio;

    @Column(name = "project")
    private String proyecto;


    private String appID;

    private String sourceService;

    private String transactionCode;

    @Column(name = "data_clientIp")
    private String dataClientIp;

    @Column(name = "data_fecha")
    private Timestamp dataFecha;

    @Column(name = "data_user")
    private String dataUser;

    @Column(name = "data_email")
    private String dataEmail;

    @Column(name = "data_seedCode")
    private String dataSeedCode;

    @Column(name = "data_country")
    private String dataCountry;

    @Column(name = "data_state")
    private String dataState;

    public UUID getIdentificador() {
        return identificador;
    }

    public void setIdentificador(UUID identificador) {
        this.identificador = identificador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Timestamp getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Timestamp fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public String getAppID() {
        return appID;
    }

    public void setAppID(String appID) {
        this.appID = appID;
    }

    public String getSourceService() {
        return sourceService;
    }

    public void setSourceService(String sourceService) {
        this.sourceService = sourceService;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public String getDataClientIp() {
        return dataClientIp;
    }

    public void setDataClientIp(String dataClientIp) {
        this.dataClientIp = dataClientIp;
    }

    public Timestamp getDataFecha() {
        return dataFecha;
    }

    public void setDataFecha(Timestamp dataFecha) {
        this.dataFecha = dataFecha;
    }

    public String getDataUser() {
        return dataUser;
    }

    public void setDataUser(String dataUser) {
        this.dataUser = dataUser;
    }

    public String getDataEmail() {
        return dataEmail;
    }

    public void setDataEmail(String dataEmail) {
        this.dataEmail = dataEmail;
    }

    public String getDataSeedCode() {
        return dataSeedCode;
    }

    public void setDataSeedCode(String dataSeedCode) {
        this.dataSeedCode = dataSeedCode;
    }

    public String getDataCountry() {
        return dataCountry;
    }

    public void setDataCountry(String dataCountry) {
        this.dataCountry = dataCountry;
    }

    public String getDataState() {
        return dataState;
    }

    public void setDataState(String dataState) {
        this.dataState = dataState;
    }
}
