package com.fintech.dao;

import com.fintech.model.ContaBancaria;
import com.fintech.util.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContaBancariaDAO {

    public List<ContaBancaria> getAll() {
        List<ContaBancaria> contas = new ArrayList<>();
        String sql = "SELECT * FROM T_FIN_CONTA_BANCARIA";

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                ContaBancaria conta = new ContaBancaria();
                conta.setIdConta(rs.getInt("ID_CONTA"));
                conta.setIdUsuario(rs.getInt("ID_USUARIO"));
                conta.setIdBco(rs.getInt("ID_BCO"));
                conta.setIdTpCt(rs.getInt("ID_TP_CT"));
                conta.setAgencia(rs.getString("AGENCIA"));
                conta.setNumConta(rs.getString("NUM_CONTA"));
                conta.setSaldoAtual(rs.getDouble("SALDO_ATUAL"));

                contas.add(conta);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return contas;
    }

    public void insert(ContaBancaria conta) {
        String sql = "INSERT INTO T_FIN_CONTA_BANCARIA (ID_CONTA, ID_USUARIO, ID_BCO, ID_TP_CT, AGENCIA, NUM_CONTA, SALDO_ATUAL) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, conta.getIdConta());
            pstmt.setInt(2, conta.getIdUsuario());
            pstmt.setInt(3, conta.getIdBco());
            pstmt.setInt(4, conta.getIdTpCt());
            pstmt.setString(5, conta.getAgencia());
            pstmt.setString(6, conta.getNumConta());
            pstmt.setDouble(7, conta.getSaldoAtual());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
