package com.br.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class TestandoListas {

    public static void main(String[] args) {

        String aula1 = "Cohecendo mais de Listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

//        String curso1 = "Java 8: Tire proveito dos novos recursos da linguagem";
//        String curso2 = "Apache Camel";
//        String curso3 = "Certificacao Java SE 8 Programmer I";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(0);

        System.out.println(aulas);

        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }

        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é " + primeiraAula);

        for (int i=0; i< aulas.size(); i++) {
            System.out.println("Aula: " + aulas.get(i));
        }

        aulas.forEach(aula -> {
            System.out.println("Percorrendo:");
            System.out.println("Aula " + aula);
        });

        aulas.add("Aumentando o nosso conhecimento");
        System.out.println(aulas);

        Collections.sort(aulas);
        System.out.println("Depois de ordenado:");
        System.out.println(aulas);
    }
}
