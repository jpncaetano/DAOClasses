package com.fintech.model;

import java.sql.Date;

public class MovimentacaoRecorrente {
    private int idMovRec;
    private int idConta;
    private int idTipoMov;
    private Date dtInicio;
    private String frequencia;
    private double valor;

    public MovimentacaoRecorrente() {
    }

    public MovimentacaoRecorrente(int idMovRec, int idConta, int idTipoMov, Date dtInicio, String frequencia, double valor) {
        this.idMovRec = idMovRec;
        this.idConta = idConta;
        this.idTipoMov = idTipoMov;
        this.dtInicio = dtInicio;
        this.frequencia = frequencia;
        this.valor = valor;
    }

    public int getIdMovRec() {
        return idMovRec;
    }

    public void setIdMovRec(int idMovRec) {
        this.idMovRec = idMovRec;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public int getIdTipoMov() {
        return idTipoMov;
    }

    public void setIdTipoMov(int idTipoMov) {
        this.idTipoMov = idTipoMov;
    }

    public Date getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(Date dtInicio) {
        this.dtInicio = dtInicio;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
