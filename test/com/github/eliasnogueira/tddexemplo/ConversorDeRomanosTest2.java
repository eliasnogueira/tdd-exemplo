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
public class ConversorDeRomanosTest2 {

    @Test
    public void converterOSimboloI() {
       // escrevemos a classe, que ainda nao exista a classe 
       ConversorDeRomanos2 conversor = new ConversorDeRomanos2();
       
       // escrevemos uma funcao, mesmo que ela nao exista na classe, recebemdo
       // como parametro o simbolo que sera convertido
       int resultadoObtido = conversor.converte("I");
       
       assertEquals(1, resultadoObtido);
    }

    
    @Test
    public void converterOSimboloV() {
       // escrevemos a classe, que ainda nao exista a classe 
       ConversorDeRomanos2 conversor = new ConversorDeRomanos2();
       
       // escrevemos uma funcao, mesmo que ela nao exista na classe, recebemdo
       // como parametro o simbolo que sera convertido
       int resultadoObtido = conversor.converte("V");
       
       assertEquals(5, resultadoObtido);
    }
}
