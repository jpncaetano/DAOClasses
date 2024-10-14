package com.fintech.dao;

import com.fintech.model.Banco;
import com.fintech.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BancoDAO {

    public List<Banco> getAll() {
        List<Banco> bancos = new ArrayList<>();
        String sql = "SELECT * FROM T_FIN_BCO";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement pstm = conn.prepareStatement(sql);
             ResultSet rs = pstm.executeQuery()) {

            while (rs.next()) {
                Banco banco = new Banco();
                banco.setIdBco(rs.getInt("ID_BCO"));
                banco.setDsBco(rs.getString("DS_BCO"));
                bancos.add(banco);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return bancos;
    }

    public void insert(Banco banco) {
        String sql = "INSERT INTO T_FIN_BCO (ID_BCO, DS_BCO) VALUES (?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement pstm = conn.prepareStatement(sql)) {

            pstm.setInt(1, banco.getIdBco());
            pstm.setString(2, banco.getDsBco());

            pstm.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
