CRUD Java com MySQL

Este é um projeto de CRUD (Create, Read, Update, Delete) de alunos feito em Java, utilizando MySQL como banco de dados.

O objetivo do projeto é servir como exemplo de aplicação Java + banco de dados, permitindo cadastrar, listar, atualizar e remover alunos de forma simples.

Tecnologias utilizadas

Java 25

MySQL

JDBC

IntelliJ IDEA

Funcionalidades

Cadastrar aluno: Adiciona um novo aluno com nome e email

Listar alunos: Exibe todos os alunos cadastrados

Atualizar aluno: Permite alterar nome e email de um aluno existente

Remover aluno: Remove um aluno pelo ID

Buscar aluno por nome: Localiza um aluno pelo nome

Estrutura do projeto

crud-java/
├── src/
│ └── gabriel/crud/
│ ├── config/ Classe de conexão com o MySQL
│ ├── model/ Classe Aluno
│ ├── repository/ Classes de acesso ao banco (CRUD)
│ ├── service/ Lógica de negócio
│ ├── Main.java Menu interativo no terminal
│ └── TesteConexao.java Teste de conexão com MySQL
├── .gitignore
└── README.md

Como rodar o projeto

Certifique-se de ter Java 25 e MySQL instalados

Clone o repositório:

git clone https://github.com/SEU_USUARIO/crud-java-mysql.git


Configure o banco de dados MySQL:

CREATE DATABASE crud_java;
CREATE TABLE alunos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(100)
);


Abra o projeto no IntelliJ IDEA

Configure a classe Conexao.java com seu usuário e senha do MySQL

Execute Main.java e use o menu para cadastrar, listar, atualizar ou remover alunos

Exemplo de uso

Menu do programa:

1 - Cadastrar aluno
2 - Listar alunos
3 - Atualizar aluno
4 - Remover aluno
5 - Buscar aluno por nome
0 - Sair

Próximos passos / melhorias possíveis

Validar formato de email antes de cadastrar

Adicionar interface gráfica (Swing ou JavaFX)

Exportar e importar dados em CSV ou Excel

Implementar login de usuário

Adicionar logs de alterações no banco
