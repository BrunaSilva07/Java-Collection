package com.br.alura;

public class TestaCurso {

    public static void main(String[] args) {
        Curso javacolecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javacolecoes.adiciona(new Aula("Trabalhando com ArrayList", 25));
        javacolecoes.adiciona(new Aula("Lista de Objetos", 19));
        javacolecoes.adiciona(new Aula("Relacionamentos com Coleções", 24));

        System.out.println(javacolecoes.getNome() + " " + javacolecoes.getInstrutor());
        System.out.println(javacolecoes.getAulas());
    }
}
