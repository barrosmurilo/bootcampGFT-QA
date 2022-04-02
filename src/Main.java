import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Desceicao Curso JavaScript!");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Aprofundando em Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria Java");
        mentoria2.setDescricao("Aprofundando em JavaScript");
        mentoria2.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Neste Bootcamp voce aprenderá Orientacao a Objetos com Java e JavaScript");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        System.out.println("\n\n --- BEM VINDOS AO BOOTCAMP DE JAVA DEVELOPER ---");

        Dev devMurilo = new Dev();
        devMurilo.setNome("Murilo");
        devMurilo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos: " + devMurilo.getConteudosInscritos());
        devMurilo.progredir();
        System.out.println("******************");
        System.out.println("Conteudos Incritos: " + devMurilo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devMurilo.getConteudosConcluidos());
        System.out.println("XP: " + devMurilo.calcularXp());

        System.out.println("------------------------");

        Dev devDaniela = new Dev();
        devDaniela.setNome("Daniela");
        devDaniela.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devDaniela.getConteudosInscritos());
        devDaniela.progredir();
        System.out.println("******************");
        System.out.println("Conteudos Inscritos: " + devDaniela.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devDaniela.getConteudosConcluidos());
        System.out.println("XP: " + devDaniela.calcularXp());


    }

}
