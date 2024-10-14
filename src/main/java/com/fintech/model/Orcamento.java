package com.fintech.model;

public class Orcamento {
    private int idOrcamento;
    private int idUsuario;
    private int idCategoria;
    private double valorMax;
    private String periodo;

    public Orcamento() {
    }

    public Orcamento(int idOrcamento, int idUsuario, int idCategoria, double valorMax, String periodo) {
        this.idOrcamento = idOrcamento;
        this.idUsuario = idUsuario;
        this.idCategoria = idCategoria;
        this.valorMax = valorMax;
        this.periodo = periodo;
    }

    public int getIdOrcamento() {
        return idOrcamento;
    }

    public void setIdOrcamento(int idOrcamento) {
        this.idOrcamento = idOrcamento;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public double getValorMax() {
        return valorMax;
    }

    public void setValorMax(double valorMax) {
        this.valorMax = valorMax;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
