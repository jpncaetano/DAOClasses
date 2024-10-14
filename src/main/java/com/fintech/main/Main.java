package com.fintech.main;

import com.fintech.dao.UsuarioDAO;
import com.fintech.model.Usuario;

import java.sql.Date;

public class Main {

    public static void main(String[] args) {
        UsuarioDAO dao = new UsuarioDAO();

        // Inserir cinco novos usuários
        Usuario usuario1 = new Usuario(1, "12345678901", "email1@teste.com", "Nome Completo 1", "senha123", Date.valueOf("2022-01-01"));
        Usuario usuario2 = new Usuario(2, "98765432109", "email2@teste.com", "Nome Completo 2", "senha123", Date.valueOf("2022-01-02"));
        Usuario usuario3 = new Usuario(3, "45678912345", "email3@teste.com", "Nome Completo 3", "senha123", Date.valueOf("2022-01-03"));
        Usuario usuario4 = new Usuario(4, "32165498765", "email4@teste.com", "Nome Completo 4", "senha123", Date.valueOf("2022-01-04"));
        Usuario usuario5 = new Usuario(5, "65498732165", "email5@teste.com", "Nome Completo 5", "senha123", Date.valueOf("2022-01-05"));

        dao.insert(usuario1);
        dao.insert(usuario2);
        dao.insert(usuario3);
        dao.insert(usuario4);
        dao.insert(usuario5);

        // Recuperar todos os usuários
        for (Usuario usuario : dao.getAll()) {
            System.out.println("ID: " + usuario.getIdUsuario() + " - Nome: " + usuario.getNmCompleto());
        }
    }
}
