package br.com.dio.desafio.dominio;

public class Projeto extends Conteudo {
    private String tecnologia;

    @Override
    public double calcularXp() {
        return XP_PADRAO * 15; // Projetos dão mais XP
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", tecnologia='" + tecnologia + '\'' +
                '}';
    }
}
