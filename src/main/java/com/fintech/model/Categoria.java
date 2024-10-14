package com.fintech.model;

public class Categoria {
    private int idCategoria;
    private String dsCategoria;

    // Construtor
    public Categoria(int idCategoria, String dsCategoria) {
        this.idCategoria = idCategoria;
        this.dsCategoria = dsCategoria;
    }

    // Getters e Setters
    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDsCategoria() {
        return dsCategoria;
    }

    public void setDsCategoria(String dsCategoria) {
        this.dsCategoria = dsCategoria;
    }
}
