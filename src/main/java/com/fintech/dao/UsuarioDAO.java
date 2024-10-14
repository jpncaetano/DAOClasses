package com.fintech.dao;

import com.fintech.model.Usuario;
import com.fintech.util.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    // Inserir novo usuário
    public void insert(Usuario usuario) {
        String sql = "INSERT INTO T_FIN_USUARIO (ID_USUARIO, CPF, EMAIL, NM_COMPLETO, SENHA, DT_CADASTRO) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, usuario.getIdUsuario());
            pstmt.setString(2, usuario.getCpf());
            pstmt.setString(3, usuario.getEmail());
            pstmt.setString(4, usuario.getNmCompleto());
            pstmt.setString(5, usuario.getSenha());
            pstmt.setDate(6, usuario.getDtCadastro());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Recuperar todos os usuários
    public List<Usuario> getAll() {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM T_FIN_USUARIO";

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("ID_USUARIO"));
                usuario.setCpf(rs.getString("CPF"));
                usuario.setEmail(rs.getString("EMAIL"));
                usuario.setNmCompleto(rs.getString("NM_COMPLETO"));
                usuario.setSenha(rs.getString("SENHA"));
                usuario.setDtCadastro(rs.getDate("DT_CADASTRO"));
                usuarios.add(usuario);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuarios;
    }
}