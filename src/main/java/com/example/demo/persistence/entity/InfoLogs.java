package com.example.demo.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name= "info_logs")

public class InfoLogs {
    @Id
    @Column(name = "logId")
    private UUID identificador;

    @Column(name = "logType")
    private String tipo;

    @Column(name = "fechaEnvio")
    private Timestamp fecha;

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
    private Timestamp dataCountry;

    @Column(name = "data_state")
    private Timestamp dataState;

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

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
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

    public Timestamp getDataCountry() {
        return dataCountry;
    }

    public void setDataCountry(Timestamp dataCountry) {
        this.dataCountry = dataCountry;
    }

    public Timestamp getDataState() {
        return dataState;
    }

    public void setDataState(Timestamp dataState) {
        this.dataState = dataState;
    }
}
