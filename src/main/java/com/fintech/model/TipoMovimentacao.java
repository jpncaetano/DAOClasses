package com.fintech.model;

public class TipoMovimentacao {
    private int idTipoMov;
    private String dsTipoMov;

    public TipoMovimentacao() {
    }

    public TipoMovimentacao(int idTipoMov, String dsTipoMov) {
        this.idTipoMov = idTipoMov;
        this.dsTipoMov = dsTipoMov;
    }

    public int getIdTipoMov() {
        return idTipoMov;
    }

    public void setIdTipoMov(int idTipoMov) {
        this.idTipoMov = idTipoMov;
    }

    public String getDsTipoMov() {
        return dsTipoMov;
    }

    public void setDsTipoMov(String dsTipoMov) {
        this.dsTipoMov = dsTipoMov;
    }
}
