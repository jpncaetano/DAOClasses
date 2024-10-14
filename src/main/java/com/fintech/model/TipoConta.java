package com.fintech.model;

public class TipoConta {
    private int idTpCt;
    private String dsCt;

    public TipoConta() {
    }

    public TipoConta(int idTpCt, String dsCt) {
        this.idTpCt = idTpCt;
        this.dsCt = dsCt;
    }

    public int getIdTpCt() {
        return idTpCt;
    }

    public void setIdTpCt(int idTpCt) {
        this.idTpCt = idTpCt;
    }

    public String getDsCt() {
        return dsCt;
    }

    public void setDsCt(String dsCt) {
        this.dsCt = dsCt;
    }
}
