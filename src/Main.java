import br.com.dio.desafio.domain.Conteudo;
import br.com.dio.desafio.domain.Curso;
import br.com.dio.desafio.domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Curso curso1 = new Curso();
        curso1.setTitulo("Descomplicando Finanacas Pessoal.");
        curso1.setDescricao("Como se planejar financeiramente para os proximos meses...");
        curso1.setCargaHoraria(20);

        System.out.println(curso1);
        System.out.println("_________________");

        Curso curso2 = new Curso();
        curso2.setTitulo("Molde seus Habitos");
        curso2.setDescricao("Aprendendo a modelar seus habitos para que estejam ainhados com suas expectativas...");
        curso2.setCargaHoraria(15);

        System.out.println(curso2);
        System.out.println("_________________");

        Conteudo conteudo = new Curso();



        System.out.println("_________________");
        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Habitos e Vicios..");
        mentoria.setDescricao("Moldelando seus habitos e vicios em prol de seus objetivos...");
        mentoria.setData(LocalDate.of(2024,10,01));
        System.out.println(mentoria);
        System.out.println("_________________");


    }
}