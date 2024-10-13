package com.fintech.main;

import com.fintech.dao.ContaBancariaDAO;
import com.fintech.model.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancariaDAO dao = new ContaBancariaDAO();

        // Inserir cinco novas contas
        ContaBancaria conta1 = new ContaBancaria(1, 1, 1, 1, "1234", "567890", 1000.00);
        ContaBancaria conta2 = new ContaBancaria(2, 2, 1, 1, "1235", "567891", 1500.50);
        ContaBancaria conta3 = new ContaBancaria(3, 3, 1, 2, "1236", "567892", 2500.75);
        ContaBancaria conta4 = new ContaBancaria(4, 4, 2, 1, "1237", "567893", 3000.20);
        ContaBancaria conta5 = new ContaBancaria(5, 5, 2, 2, "1238", "567894", 500.00);

        dao.insert(conta1);
        dao.insert(conta2);
        dao.insert(conta3);
        dao.insert(conta4);
        dao.insert(conta5);

        // Recuperar todas as contas
        for (ContaBancaria conta : dao.getAll()) {
            System.out.println("Conta ID: " + conta.getIdConta() + " | Saldo: " + conta.getSaldoAtual());
        }
    }
}
