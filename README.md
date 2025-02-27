# 🏦 FIAP Fintech - DAO e Banco de Dados

📌 **Descrição**  
Este projeto foi desenvolvido como parte do curso de **Análise e Desenvolvimento de Sistemas da FIAP**. O objetivo é implementar um **sistema DAO** para interação com um banco de dados **Oracle**, aplicando conceitos de **CRUD**, manipulação de dados e tratamento de exceções.

> ⚠️ **Aviso:** Este projeto depende do **banco de dados da FIAP** e **não pode ser executado externamente** sem acesso às credenciais do ambiente acadêmico.

---

## 🚀 **Funcionalidades Implementadas**  

✅ **Classe DAO** para acessar o banco de dados.  
✅ **Método `getAll()`** para recuperar dados via `SELECT`.  
✅ **Tratamento de exceções** para erros como indisponibilidade do banco.  
✅ **Método `insert()`** para cadastrar novos registros.  
✅ **Testes no `main()`** para inserir e consultar dados.  
✅ **Aplicação do mesmo padrão a múltiplas entidades.**  

---

## 🛠️ **Tecnologias Utilizadas**  

- **Java 17**  
- **JDBC** para conexão com o banco de dados  
- **Oracle Database (FIAP)**  
- **Maven** para gerenciamento do projeto  
- **IDE IntelliJ IDEA**  

---

## 📁 **Estrutura do Projeto**  

```
📂 src/main/java/com/fintech
 ├── 📂 dao
 │   ├── BancoDAO.java
 │   ├── CategoriaDAO.java
 │   ├── ContaBancariaDAO.java
 │   ├── MovimentacaoDAO.java
 │   ├── MovimentacaoRecorrenteDAO.java
 │   ├── OrcamentoDAO.java
 │   ├── TipoContaDAO.java
 │   ├── TipoMovimentacaoDAO.java
 │   ├── UsuarioDAO.java
 ├── 📂 model
 │   ├── Banco.java
 │   ├── Categoria.java
 │   ├── ContaBancaria.java
 │   ├── Movimentacao.java
 │   ├── MovimentacaoRecorrente.java
 │   ├── Orcamento.java
 │   ├── TipoConta.java
 │   ├── TipoMovimentacao.java
 │   ├── Usuario.java
 ├── 📂 factory
 │   ├── ConnectionFactory.java
 ├── Main.java
```

---

## ⚠️ **Atenção sobre o Banco de Dados**  

Este projeto está configurado para se conectar ao **banco de dados Oracle da FIAP**, com credenciais acadêmicas. **Se você clonar o repositório, o sistema não funcionará fora do ambiente da faculdade.**  

Caso deseje testar o código localmente, você pode:  

1️⃣ Criar um banco de dados **Oracle ou MySQL** localmente.  
2️⃣ Ajustar as credenciais na classe **`ConnectionFactory.java`**.  
3️⃣ Modificar os scripts `CREATE TABLE` e `INSERT` conforme necessário.  

---

## 📌 **Possíveis Melhorias Futuras**  

🔹 Criar um banco de dados SQLite/MySQL local para testes.  
🔹 Criar uma interface gráfica para visualizar os dados.  
🔹 Adicionar logs para melhor depuração.  
🔹 Melhorar a abstração das classes DAO.  

---

## 📜 **Licença e Uso**  

Este projeto foi desenvolvido exclusivamente para fins acadêmicos na **FIAP**. O código pode ser utilizado como referência, mas **não funcionará fora do ambiente da faculdade** sem ajustes.  

📩 **Contato:** Caso tenha dúvidas ou sugestões, entre em contato pelo GitHub.  

---

### 🔥 **Resumo Final**  

Este repositório documenta um **sistema de DAO** para o projeto Fintech da FIAP, aplicando boas práticas de **JDBC, conexão com banco de dados e manipulação de dados**. Como o banco está na FIAP, **o código não pode ser executado externamente sem modificações**.
