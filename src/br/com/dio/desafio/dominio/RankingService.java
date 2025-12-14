package br.com.dio.desafio.dominio;

import java.util.Comparator;
import java.util.List;

public class RankingService {

    public static void exibirRanking(List<Dev> devs) {
        devs.sort(Comparator.comparing(Dev::calcularTotalXp).reversed());

        System.out.println("🏆 Ranking de Devs:");
        for (int i = 0; i < devs.size(); i++) {
            Dev dev = devs.get(i);
            String nivel = NivelService.calcularNivel(dev.calcularTotalXp());
            System.out.println((i + 1) + "º lugar: " + dev.getNome() +
                    " - XP: " + dev.calcularTotalXp() +
                    " - Nível: " + nivel);
        }
    }
}
