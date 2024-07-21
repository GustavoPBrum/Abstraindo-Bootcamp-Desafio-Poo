package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    private String titulo;
    private String descricao;

    // Estamos criando uma constante
    protected static final double XP_PADRAO = 10d;

    // Sendo abstrato a classe, ela não pode ser instanciada
    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
