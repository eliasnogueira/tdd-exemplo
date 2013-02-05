package com.github.eliasnogueira.tddexemplo;

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
public class ConversorDeRomanos2 {

    public int converte(String numeroRomano) {
        if (numeroRomano.equals("I")) return 1;
        else if (numeroRomano.equals("V")) return 5;
        
        return 0;
    }
}
