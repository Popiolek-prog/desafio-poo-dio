import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Projeto;
import br.com.dio.desafio.dominio.ConquistaService;
import br.com.dio.desafio.dominio.RankingService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Criando cursos
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        // Criando mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        // Criando projeto
        Projeto projetoJava = new Projeto();
        projetoJava.setTitulo("Projeto Java");
        projetoJava.setDescricao("Construindo uma API REST");
        projetoJava.setTecnologia("Spring Boot");

        // Criando bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(projetoJava);

        // Criando devs
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        devCamila.progredir(); // conclui curso1
        devCamila.progredir(); // conclui curso2

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progredir(); // conclui curso1
        devJoao.progredir(); // conclui curso2
        devJoao.progredir(); // conclui mentoria
        devJoao.progredir(); // conclui projeto

        // Lista de devs
        List<Dev> devs = new ArrayList<>();
        devs.add(devCamila);
        devs.add(devJoao);

        // Usando o RankingService (já mostra nível)
        RankingService.exibirRanking(devs);

        // Usando o ConquistaService
        System.out.println(ConquistaService.verificarConquista(devCamila, bootcamp));
        System.out.println(ConquistaService.verificarConquista(devJoao, bootcamp));
    }
}
