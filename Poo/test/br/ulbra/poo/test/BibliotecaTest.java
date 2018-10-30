package br.ulbra.poo.test;

import br.ulbra.poo.biblioteca.Emprestimo;
import br.ulbra.poo.biblioteca.Livro;
import br.ulbra.poo.biblioteca.Pessoa;
import br.ulbra.poo.biblioteca.Revista;
import org.junit.Test;
import static org.junit.Assert.*;

public class BibliotecaTest {
    
    @Test
    public void emprestimoDeLivro(){       
        Livro l1 = new Livro("O Principe", "Maquiavel");
        Revista r1 = new Revista("Veja");
        
        Pessoa p1 = new Pessoa("Joao");
        Pessoa p2 = new Pessoa("Maria");
        
        Emprestimo e1 = new Emprestimo();
        e1.emprestar(l1, p1);
        
        Emprestimo e2 = new Emprestimo();
        e2.emprestar(r1, p2);
    }
    
    @Test
    public void cadastroDeLivro() {
        // Exercicio 2
        Livro l1 = new Livro("O Principe", "Maquiavel");
        Livro l2 = new Livro("O Principe", "Antonie");
        
        assertEquals("Maquiavel", l1.getAutor());
        assertEquals("Antonie", l2.getAutor());
        assertEquals("O Principe", l1.getTitulo());
        assertEquals("O Principe", l2.getTitulo());
    }
    
    @Test
    public void cadastroDePessoa() {
        // Exercicio 3
        Pessoa p1 = new Pessoa("Joao");
        Pessoa p2 = new Pessoa("Maria");
        
        assertEquals("Joao", p1.getNome());
        assertEquals("Maria", p2.getNome());
    }
    
}
