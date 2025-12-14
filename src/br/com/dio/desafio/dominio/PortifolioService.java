package br.com.dio.desafio.dominio;

public class PortifolioService {

    public static void exibirPortifolio(Dev dev) {
        System.out.println("📚 Portfólio de " + dev.getNome() + ":");
        if (dev.getBootcampsConcluidos().isEmpty()) {
            System.out.println("Nenhum bootcamp concluído ainda.");
        } else {
            dev.getBootcampsConcluidos().forEach(b ->
                    System.out.println("✅ " + b.getNome())
            );
        }
    }
}
