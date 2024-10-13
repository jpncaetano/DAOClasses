package com.fintech.model;

public class ContaBancaria {
    private int idConta;
    private int idUsuario;
    private int idBco;
    private int idTpCt;
    private String agencia;
    private String numConta;
    private double saldoAtual;

    // Construtores
    public ContaBancaria() {}

    public ContaBancaria(int idConta, int idUsuario, int idBco, int idTpCt, String agencia, String numConta, double saldoAtual) {
        this.idConta = idConta;
        this.idUsuario = idUsuario;
        this.idBco = idBco;
        this.idTpCt = idTpCt;
        this.agencia = agencia;
        this.numConta = numConta;
        this.saldoAtual = saldoAtual;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdBco() {
        return idBco;
    }

    public void setIdBco(int idBco) {
        this.idBco = idBco;
    }

    public int getIdTpCt() {
        return idTpCt;
    }

    public void setIdTpCt(int idTpCt) {
        this.idTpCt = idTpCt;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }
}
