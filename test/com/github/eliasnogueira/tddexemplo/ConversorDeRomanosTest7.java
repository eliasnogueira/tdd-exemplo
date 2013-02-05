package com.github.eliasnogueira.tddexemplo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Esta classe é uma classe de exemplo para o entendimento sobre TDD - Test Driven Development
 * Este projeto foi utilizado em uma palestra no Campus Party 2013
 * 
 * Este exemplo foi retirado do livro "TDD - Test Driven Development. Teste e Design no Mundo Real"
 * do autor Mauricio Aniche pela editora Casa do Codigo (http://casadocodigo.com.br)
 * 
 * @author Elias Nogueira <http://about.me/eliasnogueira>
 *
 */
public class ConversorDeRomanosTest7 {

    @Test
    public void converterOSimboloI() {
       ConversorDeRomanos7 conversor = new ConversorDeRomanos7();
       int resultadoObtido = conversor.converte("I");
       
       assertEquals(1, resultadoObtido);
    }

    @Test
    public void converterOSimboloV() {
       ConversorDeRomanos7 conversor = new ConversorDeRomanos7();
       int resultadoObtido = conversor.converte("V");
       
       assertEquals(5, resultadoObtido);
    }
    
    @Test
    public void converterOSimboloC() {
       ConversorDeRomanos7 conversor = new ConversorDeRomanos7();
       int resultadoObtido = conversor.converte("C");
       
       assertEquals(100, resultadoObtido);
    }
    
    @Test
    public void converterOSimboloII() {
       ConversorDeRomanos7 conversor = new ConversorDeRomanos7();
       int resultadoObtido = conversor.converte("II");
       
       assertEquals(2, resultadoObtido);
    }
    
    @Test
    public void converterOSimboloVI() {
       ConversorDeRomanos7 conversor = new ConversorDeRomanos7();
       int resultadoObtido = conversor.converte("VI");
       
       assertEquals(6, resultadoObtido);
    }
    
    @Test
    public void converterOSimboloIX() {
       ConversorDeRomanos7 conversor = new ConversorDeRomanos7();
       int resultadoObtido = conversor.converte("IX");
       
       assertEquals(9, resultadoObtido);
    }

    @Test
    public void converterOSimboloXXIV() {
       ConversorDeRomanos7 conversor = new ConversorDeRomanos7();
       int resultadoObtido = conversor.converte("XXIV");
       
       assertEquals(24, resultadoObtido);
    }
    
}
