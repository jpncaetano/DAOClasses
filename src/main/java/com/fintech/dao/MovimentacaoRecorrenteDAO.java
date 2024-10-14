package com.fintech.dao;

import com.fintech.model.MovimentacaoRecorrente;
import com.fintech.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MovimentacaoRecorrenteDAO {

    public List<MovimentacaoRecorrente> getAll() {
        List<MovimentacaoRecorrente> movimentacoesRecorrentes = new ArrayList<>();
        String sql = "SELECT * FROM T_FIN_MOV_REC";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement pstm = conn.prepareStatement(sql);
             ResultSet rs = pstm.executeQuery()) {

            while (rs.next()) {
                MovimentacaoRecorrente movRec = new MovimentacaoRecorrente();
                movRec.setIdMovRec(rs.getInt("ID_MOV_REC"));
                movRec.setIdConta(rs.getInt("ID_CONTA"));
                movRec.setIdTipoMov(rs.getInt("ID_TIPO_MOV"));
                movRec.setDtInicio(rs.getDate("DT_INICIO"));
                movRec.setFrequencia(rs.getString("FREQUENCIA"));
                movRec.setValor(rs.getDouble("VALOR"));
                movimentacoesRecorrentes.add(movRec);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return movimentacoesRecorrentes;
    }

    public void insert(MovimentacaoRecorrente movRec) {
        String sql = "INSERT INTO T_FIN_MOV_REC (ID_MOV_REC, ID_CONTA, ID_TIPO_MOV, DT_INICIO, FREQUENCIA, VALOR) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement pstm = conn.prepareStatement(sql)) {

            pstm.setInt(1, movRec.getIdMovRec());
            pstm.setInt(2, movRec.getIdConta());
            pstm.setInt(3, movRec.getIdTipoMov());
            pstm.setDate(4, (Date) movRec.getDtInicio());
            pstm.setString(5, movRec.getFrequencia());
            pstm.setDouble(6, movRec.getValor());

            pstm.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
