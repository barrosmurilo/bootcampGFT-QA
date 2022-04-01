import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Neste curso, iremos aplicar os conceitos de POO utuilizando a linguagem Java!");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Neste curso, iremos aplicar os conceitos de POO utuilizando a linguagem Python!");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Aprofundando um pouco mais na linguagem Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria Java");
        mentoria2.setDescricao("Aprofundando um pouco mais na linguagem Java");
        mentoria2.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);

        System.out.println(mentoria1);
        System.out.println(mentoria2 );

    }

}
