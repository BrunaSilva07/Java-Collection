package com.br.alura;

public class TestaCursoComAluno {

    public static void main(String[] args) {
        Curso javacolecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javacolecoes.adiciona(new Aula("Trabalhando com ArrayList", 25));
        javacolecoes.adiciona(new Aula("Lista de Objetos", 19));
        javacolecoes.adiciona(new Aula("Relacionamentos com Coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);

        javacolecoes.matricula(a1);
        javacolecoes.matricula(a2);
        javacolecoes.matricula(a3);

        System.out.println("Todos os alunos matriculados: ");
        javacolecoes.getAlunos().forEach(System.out::println);

        System.out.println("O aluno " + a1 + " está matriculado?");
        System.out.println(javacolecoes.estaMaticulado(a1));

        Aluno a = new Aluno("Rodrigo Turini", 34672);
        System.out.println("Esse aluno está matriculado?");
        System.out.println(javacolecoes.estaMaticulado((a)));

        System.out.println("O a1 é equals ao a?");
        System.out.println(a1.equals(a));

        // Obrigatoriamente o seguinte é true:

        System.out.println(a1.hashCode() == a.hashCode());
    }
}
