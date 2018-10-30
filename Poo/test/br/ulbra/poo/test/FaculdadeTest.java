package br.ulbra.poo.test;

import org.junit.Test;
import static org.junit.Assert.*;

public class FaculdadeTest {
    
    @Test
    public void cadastroDeAluno() {
        // nome, cpf
        Aluno a1 = new Aluno("Pedro", "123456");
        Aluno a2 = new Aluno("Paulo", "654321");
        
        assertEquals("Pedro", a1.getNome());
        assertEquals("Paulo", a2.getNome());
        
        assertEquals("123456", a1.getCpf());
        assertEquals("654321", a2.getCpf());
    }
    
    @Test
    public void cadastroDeCurso() {
        Curso c = new Curso("Sistemas de Informacao");
        
        assertEquals("Sistemas de Informacao", c.getNome());
    }
    
    @Test
    public void cadastroDeProfessor() {
        Professor p = new Professor("Thyago");
        
        assertEquals("Thyago", p.getNome());
    }
    
    @Test
    public void cadastroDeDisciplina() {
        Curso c = new Curso("SI");        
        Professor p = new Professor("Thyago");
        
        Disciplina d = new Disciplina("POO", c, p);
        
        assertEquals("POO", d.getNome());
        assertEquals("Thyago", d.getProfessor().getNome());
        assertEquals("SI", d.getCurso().getNome());
    }
    
    @Test
    public void cadastroDeMatricula() {
        Curso c = new Curso("SI");        
        Professor p = new Professor("Thyago");
        
        Disciplina d = new Disciplina("POO", c, p);

        Aluno a1 = new Aluno("Fulano");
        Aluno a2 = new Aluno("Ciclano");
        Aluno a3 = new Aluno("Beltrano");
        
        Matricula m1 = new Matricula(d, a1);
        Matricula m2 = new Matricula(d, a2);
        Matricula m3 = new Matricula(d, a3);
        
        assertEquals("Fulano", m1.getAluno().getNome());
        assertEquals("Ciclano", m2.getAluno().getNome());
        assertEquals("Beltrano", m3.getAluno().getNome());
    }
    
}
