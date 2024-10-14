package com.fintech.model;

public class Banco {
    private int idBco;
    private String dsBco;

    public Banco() {
    }

    public Banco(int idBco, String dsBco) {
        this.idBco = idBco;
        this.dsBco = dsBco;
    }

    public int getIdBco() {
        return idBco;
    }

    public void setIdBco(int idBco) {
        this.idBco = idBco;
    }

    public String getDsBco() {
        return dsBco;
    }

    public void setDsBco(String dsBco) {
        this.dsBco = dsBco;
    }
}
