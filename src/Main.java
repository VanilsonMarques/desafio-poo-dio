import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Cursos;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.Instant;
import java.util.Date;

public class Main {

        public static void main(String[] args) {
            Cursos curso1 = new Cursos();
            curso1.setTitulo("Curso java");
            curso1.setDescricao("descrição curso Java");
            curso1.setCaraHoraria(8);

            Cursos curso2 = new Cursos();
            curso2.setTitulo("Curso JS");
            curso2.setDescricao("descrição curso JS");
            curso2.setCaraHoraria(4);


            Mentoria mentoria = new Mentoria();
            mentoria.setTitulo("mentoria de java");
            mentoria.setDescricao("descrição mentoria java");
            mentoria.setData(Date.from(Instant.now()));


            /*  System.out.println(curso1);
                System.out.println(curso2);
                System.out.println(mentoria);*/

            Bootcamp bootcamp = new Bootcamp();
            bootcamp.setNome("Bootcamp Java Developer");
            bootcamp.setDescricao("Descrição bootcamp java developer");
            bootcamp.getConteudos().add(curso1);
            bootcamp.getConteudos().add(curso2);
            bootcamp.getConteudos().add(mentoria);

            Dev devVanilson = new Dev();
            devVanilson.setNome("Vanilson");
            devVanilson.inscreverBootcamp(bootcamp);
            System.out.println("conteudos Inscritos de Vanilson" + devVanilson.getConteudosInscritos());
            devVanilson.progredir();
            devVanilson.progredir();
            System.out.println("-");
            System.out.println("conteudos Inscritos de Vanilson" + devVanilson.getConteudosInscritos());
            System.out.println("conteudos Concluidos de Vanilson:" + devVanilson.getConteudosConcluidos());
            System.out.println("XP:" + devVanilson.calcularXp());
            System.out.println("--------");
            Dev devAlex = new Dev();
            devAlex.setNome("Alex");
            devAlex.inscreverBootcamp(bootcamp);
            System.out.println("conteudos Inscritos de Alex" + devAlex.getConteudosInscritos());
            devAlex.progredir();
            devAlex.progredir();
            devAlex.progredir();
            System.out.println("-");
            System.out.println("conteudos  Inscritos de Alex" + devAlex.getConteudosInscritos());
            System.out.println("conteudos Concluidos de Alex" + devAlex.getConteudosConcluidos());
            System.out.println("XP:" + devAlex.calcularXp());
        }
}
