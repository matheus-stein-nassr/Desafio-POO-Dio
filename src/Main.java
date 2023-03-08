import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("Curso java");
    curso1.setDescricao("Descrição curso java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso js");
    curso2.setDescricao("Descrição curso js");
    curso2.setCargaHoraria(4);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria de java");
    mentoria.setDescricao("Descrição mentoria java");
    mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descrição Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev devMatheus = new Dev();
    devMatheus.setNome("Matheus");
    devMatheus.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos Inscritos Matheus: " + devMatheus.getConteudosInscritos());
    devMatheus.progredir();
    devMatheus.progredir();
    System.out.println("-");
    System.out.println("Conteúdos Inscritos Matheus: " + devMatheus.getConteudosInscritos());
    System.out.println("Conteúdos Concluídos Matheus: " + devMatheus.getConteudosConcluidos());
    System.out.println("XP:" + devMatheus.calcularTotalXp());

    System.out.println("----------------------------");

    Dev devJoao = new Dev();
    devJoao.setNome("Joao");
    devJoao.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
    devJoao.progredir();
    devJoao.progredir();
    devJoao.progredir();
    System.out.println("-");
    System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
    System.out.println("Conteúdos Concluidos João: " + devJoao.getConteudosConcluidos());
    System.out.println("XP:" + devJoao.calcularTotalXp());

}

}