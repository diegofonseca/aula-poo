package br.ulbra.poo.test;

import br.ulbra.poo.Calculadora;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
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
