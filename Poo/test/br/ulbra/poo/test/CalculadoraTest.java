package br.ulbra.poo.test;

import br.ulbra.poo.Calculadora;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    @Test
    public void mediaPonderada() {
        Calculadora c = new Calculadora();
        int resultado1 = c.mediaPonderada(80,50);
        int resultado2 = c.mediaPonderada(80,65);
                    
        assertEquals(60, resultado1);
        assertEquals(70, resultado2);
    }
    
    @Test
    public void somaTest() {
        Calculadora c = new Calculadora();
        int resultado = c.soma(2,2);
        
        assertEquals(4, resultado);
    }
    
    @Test
    public void subtracaoTest() {
        // ...
    }
}
