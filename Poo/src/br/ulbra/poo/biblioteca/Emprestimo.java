package br.ulbra.poo.biblioteca;

public class Emprestimo {
    private Exemplar exemplar;
    private Pessoa pessoa;
    
    public void emprestar(Exemplar e, Pessoa p) {
        this.exemplar = e;
        this.pessoa = p;
    }
}
