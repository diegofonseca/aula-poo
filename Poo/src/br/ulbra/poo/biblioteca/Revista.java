package br.ulbra.poo.biblioteca;

public class Revista implements Exemplar {
    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Revista(String titulo) {
        this.titulo = titulo;
    }
}
