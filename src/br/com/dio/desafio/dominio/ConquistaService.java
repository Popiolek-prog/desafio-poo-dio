package br.com.dio.desafio.dominio;

public class ConquistaService {

    public static String verificarConquista(Dev dev, Bootcamp bootcamp) {
        if (dev.getConteudosConcluidos().containsAll(bootcamp.getConteudos())) {
            return "🏅 " + dev.getNome() + " concluiu o Bootcamp!";
        }
        return "⏳ " + dev.getNome() + " ainda está em progresso.";
    }
}
