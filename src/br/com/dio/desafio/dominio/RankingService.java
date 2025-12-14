package br.com.dio.desafio.dominio;

import java.util.Comparator;
import java.util.List;

public class RankingService {

    // Método estático para exibir o ranking de devs
    public static void exibirRanking(List<Dev> devs) {
        // Ordena os devs pelo XP total (do maior para o menor)
        devs.sort(Comparator.comparing(Dev::calcularTotalXp).reversed());

        System.out.println("🏆 Ranking de Devs:");
        for (int i = 0; i < devs.size(); i++) {
            Dev dev = devs.get(i);
            System.out.println((i + 1) + "º lugar: " + dev.getNome() + " - XP: " + dev.calcularTotalXp());
        }
    }
}
