package com.br.alura;

import java.util.Collection;
import java.util.HashSet;

public class TestaAluno {

    public static void main(String[] args) {
        Collection<String> alunos = new HashSet<>();

        alunos.add("Bruna Silva");
        alunos.add("Alexandre Borba");
        alunos.add("Fernando Machado");
        alunos.add("Carla Cristina");
        alunos.add("Alice Rocha");

        System.out.println(alunos);

        alunos.remove("Alexandre Borba");

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

        System.out.println(alunos);

        System.out.println(alunos.size());

        System.out.println(alunos.contains("Alexandre Borba"));

    }
}
