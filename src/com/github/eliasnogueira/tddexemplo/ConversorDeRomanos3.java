package com.github.eliasnogueira.tddexemplo;

import java.util.HashMap;
import java.util.Map;

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
public class ConversorDeRomanos3 {

    @SuppressWarnings("serial")
    private static Map<String, Integer> tabela = new HashMap<String, Integer>() {{
        put("I", 1);
        put("V", 5);
        put("X", 10);
        put("L", 50);
        put("C", 100);
        put("D", 500);
        put("M", 1000);
    }};
    
    public int converte(String numeroRomano) {
        return tabela.get(numeroRomano);
    }
}
