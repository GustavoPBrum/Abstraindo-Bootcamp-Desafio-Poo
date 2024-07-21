import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();  // Instanciando o objeto

        // Usando 'set' usaremos para atribuir valores
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso SQL");
        curso2.setDescricao("Descrição do curso SQL");
        curso2.setCargaHoraria(6);

        // Instanciando a mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Falando sobre a linguagem java");
        mentoria.setData(LocalDate.now());  // A data de criação atual em que for criada

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer ");
        bootcamp.setDescricao("Descrição Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGustavo = new Dev();
        devGustavo.setNome("Gustavo");
        devGustavo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devGustavo.getConteudosInscritos());
        devGustavo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos: " + devGustavo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devGustavo.getConteudosConcluidos());
        System.out.println("XP: " + devGustavo.calcularTotalXp());

        System.out.println("--------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos: " + devGustavo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devGustavo.calcularTotalXp());


    }
}