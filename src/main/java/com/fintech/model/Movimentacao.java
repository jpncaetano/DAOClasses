package com.fintech.model;

import java.util.Date;

public class Movimentacao {
    private int idMov;
    private int idConta;
    private int idTipoMov;
    private int idCategoria;
    private Date dtMov;
    private double vlMov;

    // Construtor
    public Movimentacao(int idMov, int idConta, int idTipoMov, int idCategoria, Date dtMov, double vlMov) {
        this.idMov = idMov;
        this.idConta = idConta;
        this.idTipoMov = idTipoMov;
        this.idCategoria = idCategoria;
        this.dtMov = dtMov;
        this.vlMov = vlMov;
    }

    // Getters e Setters
    public int getIdMov() {
        return idMov;
    }

    public void setIdMov(int idMov) {
        this.idMov = idMov;
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

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Date getDtMov() {
        return dtMov;
    }

    public void setDtMov(Date dtMov) {
        this.dtMov = dtMov;
    }

    public double getVlMov() {
        return vlMov;
    }

    public void setVlMov(double vlMov) {
        this.vlMov = vlMov;
    }
}
