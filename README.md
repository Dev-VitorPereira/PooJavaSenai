# Projeto SENAI: Sistema de Gerenciamento Escolar

Este projeto é uma aplicação Java simples utilizando `JOptionPane` para entrada de dados, representando um sistema básico de gerenciamento escolar. O programa permite cadastrar alunos, professores, turmas e disciplinas em uma escola fictícia chamada SENAI.

Este projeto foi desenvolvido como parte das aulas de Java no SENAI.

## Funcionalidades

- Cadastro de alunos (nome, matrícula, idade);
- Cadastro de professores (nome, matéria);
- Criação de turmas associadas a um professor;
- Cadastro de disciplinas com carga horária e professor responsável;
- Listagem de alunos e professores cadastrados;
- Associação de alunos a uma turma específica;
- Exibição do status da disciplina cadastrada.

## Tecnologias Utilizadas

- Linguagem: Java
- Interface gráfica: `JOptionPane` (para entrada de dados)


## Estrutura do Código

O código principal (`Main.java`) realiza as seguintes operações:

1. Solicita ao usuário informações sobre um aluno e cria um objeto `Aluno`.
2. Solicita informações sobre um professor e cria um objeto `Professor`.
3. Cria uma escola (`Escola`) e adiciona o aluno e professor.
4. Cria uma turma (`Turma`) e uma disciplina (`Disciplina`).
5. Associa o professor à disciplina e o aluno à turma.
6. Exibe as informações cadastradas.


## Autor

Desenvolvido por Vitor Pereira.

