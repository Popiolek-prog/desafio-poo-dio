package br.com.dio.desafio.dominio;

public class NivelService {

    public static String calcularNivel(double xp) {
        if (xp < 100) {
            return "Iniciante";
        } else if (xp < 200) {
            return "Intermediário";
        } else {
            return "Avançado";
        }
    }
}
