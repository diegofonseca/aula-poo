package br.ulbra.poo.test;

import br.ulbra.poo.Calculadora;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    @Test
    public void mediaPonderada() {
        Calculadora c = new Calculadora();
        double resultado1 = c.mediaPonderada(80.0,50.0);
        double resultado2 = c.mediaPonderada(80.0,65.0);
                    
        assertEquals(60.0, resultado1);
        assertEquals(70.0, resultado2);
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
