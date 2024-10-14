package com.fintech.model;

public class Usuario {
    private int idUsuario;
    private String cpf;
    private String email;
    private String nmCompleto;
    private String senha;
    private java.sql.Date dtCadastro;

    // Construtor vazio
    public Usuario() {
    }

    // Construtor com parâmetros
    public Usuario(int idUsuario, String cpf, String email, String nmCompleto, String senha, java.sql.Date dtCadastro) {
        this.idUsuario = idUsuario;
        this.cpf = cpf;
        this.email = email;
        this.nmCompleto = nmCompleto;
        this.senha = senha;
        this.dtCadastro = dtCadastro;
    }

    // Getters e Setters
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNmCompleto() {
        return nmCompleto;
    }

    public void setNmCompleto(String nmCompleto) {
        this.nmCompleto = nmCompleto;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public java.sql.Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(java.sql.Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }
}
