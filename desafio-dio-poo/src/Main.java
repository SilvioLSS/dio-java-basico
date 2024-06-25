import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria = new Mentoria();

        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Descrição Curso JAVA");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);

        mentoria.setTitulo("Mentoria de JAVA");
        mentoria.setDescricao("Descrição Mentoria de JAVA");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp descrição Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev Silvio = new Dev();
        Silvio.setNome("Silvio");
        Silvio.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Silvio: " + Silvio.getConteudosInscritos());
        Silvio.progredir();
        Silvio.progredir();
        System.out.println("Conteudos inscritos Silvio: " + Silvio.getConteudosInscritos());
        System.out.println("Conteudos concluidos Silvio: " + Silvio.getConteudosConcluidos());
        System.out.println("XP: " + Silvio.calcularTotalXp());

        System.out.println("--------------------------------------------");

        Dev Carol = new Dev();
        Carol.setNome("Carol");
        Carol.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Carol: " + Carol.getConteudosInscritos());
        Carol.progredir();
        System.out.println("Conteudos inscritos Carol: " + Carol.getConteudosInscritos());
        System.out.println("Conteudos concluidos Carol: " + Carol.getConteudosConcluidos());
        System.out.println("XP: " + Carol.calcularTotalXp());

    }
}