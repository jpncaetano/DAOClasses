package com.fintech.dao;

import com.fintech.model.TipoMovimentacao;
import com.fintech.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TipoMovimentacaoDAO {

    public List<TipoMovimentacao> getAll() {
        List<TipoMovimentacao> tiposMovimentacao = new ArrayList<>();
        String sql = "SELECT * FROM T_FIN_TIPO_MOV";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement pstm = conn.prepareStatement(sql);
             ResultSet rs = pstm.executeQuery()) {

            while (rs.next()) {
                TipoMovimentacao tipoMovimentacao = new TipoMovimentacao();
                tipoMovimentacao.setIdTipoMov(rs.getInt("ID_TIPO_MOV"));
                tipoMovimentacao.setDsTipoMov(rs.getString("DS_TIPO_MOV"));
                tiposMovimentacao.add(tipoMovimentacao);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tiposMovimentacao;
    }

    public void insert(TipoMovimentacao tipoMovimentacao) {
        String sql = "INSERT INTO T_FIN_TIPO_MOV (ID_TIPO_MOV, DS_TIPO_MOV) VALUES (?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement pstm = conn.prepareStatement(sql)) {

            pstm.setInt(1, tipoMovimentacao.getIdTipoMov());
            pstm.setString(2, tipoMovimentacao.getDsTipoMov());

            pstm.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
