/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.poo.test;

import br.ulbra.poo.Conta;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Labin 05
 */
public class ContaTest {
   
    @Test
    public void depositaTest() {
        Conta c1 = new Conta(15.0);
        
        c1.deposita(30.0);
        
        assertEquals(45.0, c1.getSaldo(),0);
    }
    
}
