package com.fintech.dao;

import com.fintech.model.Orcamento;
import com.fintech.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrcamentoDAO {

    public List<Orcamento> getAll() {
        List<Orcamento> orcamentos = new ArrayList<>();
        String sql = "SELECT * FROM T_FIN_ORCAMENTO";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement pstm = conn.prepareStatement(sql);
             ResultSet rs = pstm.executeQuery()) {

            while (rs.next()) {
                Orcamento orcamento = new Orcamento();
                orcamento.setIdOrcamento(rs.getInt("ID_ORCAMENTO"));
                orcamento.setIdUsuario(rs.getInt("ID_USUARIO"));
                orcamento.setIdCategoria(rs.getInt("ID_CATEGORIA"));
                orcamento.setValorMax(rs.getDouble("VALOR_MAX"));
                orcamento.setPeriodo(rs.getString("PERIODO"));
                orcamentos.add(orcamento);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return orcamentos;
    }

    public void insert(Orcamento orcamento) {
        String sql = "INSERT INTO T_FIN_ORCAMENTO (ID_ORCAMENTO, ID_USUARIO, ID_CATEGORIA, VALOR_MAX, PERIODO) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement pstm = conn.prepareStatement(sql)) {

            pstm.setInt(1, orcamento.getIdOrcamento());
            pstm.setInt(2, orcamento.getIdUsuario());
            pstm.setInt(3, orcamento.getIdCategoria());
            pstm.setDouble(4, orcamento.getValorMax());
            pstm.setString(5, orcamento.getPeriodo());

            pstm.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
