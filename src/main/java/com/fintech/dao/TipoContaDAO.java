package com.fintech.dao;

import com.fintech.model.TipoConta;
import com.fintech.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TipoContaDAO {

    public List<TipoConta> getAll() {
        List<TipoConta> tiposConta = new ArrayList<>();
        String sql = "SELECT * FROM T_FIN_TIPO_CT";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement pstm = conn.prepareStatement(sql);
             ResultSet rs = pstm.executeQuery()) {

            while (rs.next()) {
                TipoConta tipoConta = new TipoConta();
                tipoConta.setIdTpCt(rs.getInt("ID_TP_CT"));
                tipoConta.setDsCt(rs.getString("DS_CT"));
                tiposConta.add(tipoConta);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tiposConta;
    }

    public void insert(TipoConta tipoConta) {
        String sql = "INSERT INTO T_FIN_TIPO_CT (ID_TP_CT, DS_CT) VALUES (?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement pstm = conn.prepareStatement(sql)) {

            pstm.setInt(1, tipoConta.getIdTpCt());
            pstm.setString(2, tipoConta.getDsCt());

            pstm.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
