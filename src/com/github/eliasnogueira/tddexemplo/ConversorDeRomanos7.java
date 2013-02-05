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
public class ConversorDeRomanos7 {

    @SuppressWarnings("serial")
    private static Map<Character, Integer> tabela = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};
    
    public int converte(String numeroRomano) {
        int acumulador = 0;
        int ultimoVizinhoDaDireita = 0;

        for(int i = numeroRomano.length() - 1; i >= 0; i--) {
            // pega o inteiro referente ao simbolo atual
            int atual = tabela.get(numeroRomano.charAt(i));
            
            // se o da direita for menor, o multiplicaremos
            // por -1 para torná-lo negativo
            int multiplicador = 1;
            if(atual < ultimoVizinhoDaDireita) multiplicador = -1;
            acumulador += tabela.get(numeroRomano.charAt(i)) * multiplicador;
            
            // atualiza o vizinho da direita
            ultimoVizinhoDaDireita = atual;
        }
        return acumulador;
    }
}
