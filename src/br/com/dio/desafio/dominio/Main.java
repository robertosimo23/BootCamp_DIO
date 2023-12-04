package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso cursoA = new Curso();
        cursoA.setTitulo("Curso Dev Java");
        cursoA.setDescricao("Curso Completo de Java introdução ao avançado");
        cursoA.setCargaHoraria(76);

        Curso cursoB = new Curso();
        cursoB.setTitulo("Curso de SQL");
        cursoB.setDescricao("Curso Completo de SQL introdução ao avançado");
        cursoB.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Acompanhamento de Exercicios em Java");
        mentoria1.setData(LocalDate.now());

        BootCamp bootCampDevJava = new BootCamp();
        bootCampDevJava.setNome("Java Developer");
        bootCampDevJava.setDescricao("Java Developer");
        bootCampDevJava.getConteudos().add(cursoA);
        bootCampDevJava.getConteudos().add(cursoB);
        bootCampDevJava.getConteudos().add(mentoria1);

        Dev devRoberto = new Dev();
        devRoberto.setNome("Roberto");
        devRoberto.inscreverBootcamp(bootCampDevJava);
        System.out.println("Conteúdos de Roberto : " + " " + devRoberto.getConteudosInscritos() );
        devRoberto.progredir();
        devRoberto.progredir();
        System.out.println("------------------------------------------");
        System.out.println("Conteúdos de Roberto : " + " " + devRoberto.getConteudosInscritos() );
        System.out.println("Contudos Concludos de Roberto : " + devRoberto.getConteudosConcluidos());
        System.out.println("XP : " + devRoberto.calcularTotalXP());



    }
}