package com.br.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {
        Curso javacolecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javacolecoes.adiciona(new Aula("Trabalhando com ArrayList", 25));
        javacolecoes.adiciona(new Aula("Lista de Objetos", 19));
        javacolecoes.adiciona(new Aula("Relacionamentos com Coleções", 24));

        List<Aula> aulasImutaveis = javacolecoes.getAulas();

        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        System.out.println(javacolecoes.getTempoTotal());
        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println(javacolecoes);
    }
}
