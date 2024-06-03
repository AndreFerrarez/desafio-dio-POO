import br.com.dio.desafio.domain.*;

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
        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Habitos e Vicios..");
        mentoria.setDescricao("Moldelando seus habitos e vicios em prol de seus objetivos...");
        mentoria.setData(LocalDate.of(2024,10,01));
        System.out.println(mentoria);
        System.out.println("_________________");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Alto Desempenho Pessoal...");
        bootcamp.setDescricao("Bootcamp nivel 3 -  Fase Intermediaria..");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devAndre = new Dev();
        devAndre.setNome("Andre Ferrarez");
        devAndre.inscreverBootcamp(bootcamp);
        System.out.println(devAndre.getNome());
        System.out.println("Inscricoes realizadas...\n" + devAndre.getConteudosInscritos());

        devAndre.progredir();
        devAndre.progredir();
        System.out.println("**");

        System.out.println(devAndre.getNome() + " - XP "  +devAndre.calcularTotalXp());

        System.out.println("Mentoria e cursos finalizados...");
        System.out.println(devAndre.getConteudosConcluidos());







    }
}