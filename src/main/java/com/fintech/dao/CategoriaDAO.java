package com.fintech.dao;

import com.fintech.model.Categoria;
import com.fintech.util.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {

    // Obter todas as categorias
    public List<Categoria> getAll() {
        List<Categoria> categorias = new ArrayList<>();
        String sql = "SELECT * FROM T_FIN_CATEGORIA";

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Categoria categoria = new Categoria(
                        rs.getInt("ID_CATEGORIA"),
                        rs.getString("DS_CATEGORIA")
                );
                categorias.add(categoria);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return categorias;
    }

    // Inserir uma nova categoria
    public void insert(Categoria categoria) {
        String sql = "INSERT INTO T_FIN_CATEGORIA (ID_CATEGORIA, DS_CATEGORIA) VALUES (?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, categoria.getIdCategoria());
            pstmt.setString(2, categoria.getDsCategoria());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
