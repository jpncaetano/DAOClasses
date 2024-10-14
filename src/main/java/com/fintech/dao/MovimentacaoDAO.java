package com.fintech.dao;

import com.fintech.model.Movimentacao;
import com.fintech.util.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovimentacaoDAO {

    // Obter todas as movimentações
    public List<Movimentacao> getAll() {
        List<Movimentacao> movimentacoes = new ArrayList<>();
        String sql = "SELECT * FROM T_FIN_MOVIMENTACAO";

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Movimentacao movimentacao = new Movimentacao(
                        rs.getInt("ID_MOV"),
                        rs.getInt("ID_CONTA"),
                        rs.getInt("ID_TIPO_MOV"),
                        rs.getInt("ID_CATEGORIA"),
                        rs.getDate("DT_MOV"),
                        rs.getDouble("VL_MOV")
                );
                movimentacoes.add(movimentacao);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return movimentacoes;
    }

    // Inserir uma nova movimentação
    public void insert(Movimentacao movimentacao) {
        String sql = "INSERT INTO T_FIN_MOVIMENTACAO (ID_MOV, ID_CONTA, ID_TIPO_MOV, ID_CATEGORIA, DT_MOV, VL_MOV) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, movimentacao.getIdMov());
            pstmt.setInt(2, movimentacao.getIdConta());
            pstmt.setInt(3, movimentacao.getIdTipoMov());
            pstmt.setInt(4, movimentacao.getIdCategoria());
            pstmt.setDate(5, new java.sql.Date(movimentacao.getDtMov().getTime()));
            pstmt.setDouble(6, movimentacao.getVlMov());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
