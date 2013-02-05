tdd-exemplo
===========

Exemplo simples sobre como aplicar TDD com um problema de números romanos


Explicação sobre o projeto
===========
Passo 1
Primeiro temos a classe ConversorDeRomanosTest1 na pasta test. Nele, como estamos implementando os números romanos iremos criar primeiro o teste para depois desenhar a classe e o método de conversão.
Criamos o método converterOSimboloI, garantindo que o símbolo I retornará 1. Assim, mesmo sem ter a classe e o método de conversão iremos escrevê-lo.
Após escrever iremos executar executar o teste, mesmo sabendo que o teste irá falhar porque a classe e o método de conversão não existe.

Criaremos a classe ConversorDeRomanos1 e o método conversor. Como um dos princípio do TDD é a simplicidade iremos fazer com que a função retorno somente o esperado pelo teste, neste caso 1.
Agora execute o teste... ele irá passar!

Passo 2
Agora temos a classe ConversorDeRomanosTeste2. Nela criamos um teste chamado converteOSimboloV() para testar se o simbilo "V" retorna 5. Primeiros iremos executar a classe de teste. o teste converteOSimboloI passa, mas o converteOSimboloV não. Porque?
Isso acontece porque o método converte não está implementado para retornar 5 para o símbolo "V".

Agora teremos que alterar o método converter, e faremos isso na classe ConversorDeRomano2, onde sempre criando a abordagem mais simples possível, apenas colocaremos uma condição. Dê uma olhada no método.

Passo 3
Isso já nos garante o retorno deste dois símbolos, mas caso eu queira testar com todos os outros? Colocaremos um monte de IF-ELSE no código?
Seria um saida, mas não seria nada "elegante".
Mas antes de tudo criaremos mais um teste, agora para o símbolo "C" que deve retornar 100. O teste converteOSimboloC() da classe ConversorDeRomanosTest3, logo quando criado, obviamente falha na execução.

Na classe ConversorDeRomano3 criamos uma "mapa" (HashMap) para comportar todos os símbolos padrão em romanos.
Se você não conhece sobre estrutura de dados em Java, principalmente a HashMap, visualize o link abaixo:
LINK DO HASHMAP
Agora iremos alterar o método converte para que ele procure no mapa o símbolo de entrada e retorno o valor relacionado.

Passo 4
E se agora aumentarmos a complexidade?
Criaremos um teste na classe ConversorDeRomanosTest4 com o nome converteOSimboloII() para testar se o símbolo "II" retorna 2.
Execute o teste e, obviamente, ele falhará!

Como sempre começamos pelo mais simples, iremos alterar o método converte da classe ConversorDeRomanos5 para entender o símbolo "II" e retornar 2 adicionando mais essa linha no mapa. O teste agora passa... Mas temos uma infinidade mais de combinações, certo?

Passo 5
Iremos manter o teste converteOSimboloII(), agora da classe ConversorDeRomanosTest5 para refatorar o método converte da classe ConversorDeRomanos5.
Faremos isso porque fica muito trabalhoso adicionar todas as possibilidades de símbolos romanos no mapa, logo colocaremos um pouco de inteligência no método converte.

Para isso agora o método converte acumula o valor de cada símbolo. Dentro do laço for ele verifica a quatidade de caracteres de entrada (os símbolos romanos), pega sempre o primeiro caractere e coloca o valor relacionado no acumulador. Dê uma olhada no método converte da classe ConversorDeRomanos5.

Passo 6
Agora sabemos que há uma certa inteligência sem a necessidade de muito código. Isso é comum e chamamos este processo de refatoração!
Apenas para fins de teste vamos criar um método converteOSimboloVI() na classe ConversorDeRomanos6. 
Execute o teste e verifique se o mesmo irá passar...

O teste executa com sucesso! Note que a particuladide agora está sendo os testes que, onde existe dois caracteres, o manor valor sempre é o símbolo da esquerda. No caso de "VI" (6) o menor é o "V" (5) que, no método converte, soma com "I" (6).
Mas se colocarmos o inverso para o simbolo "IX" (11)?


Passo 7
Criaremos o teste converterOSimboloIX() na classe ConversorDeRomanosTest7. Ao executarmos o teste visualizamos que o mesmo falha. Deveriamos ter o resultado 9 mas a função converte nos retorna 11.

Esse é o momento de refatoramos o nosso método converte. Uma possível implementação é verificar se subtrair o valor da esquerda para direita quando este número for menor que seu vizinho na direita, senão acumulamos o valor.

Para fins de teste desta refatoração criaremos o teste converteOSimboloXXIV() para testar o algoritmo.
Agora temos uma possível implementação da conversão de números romanos com um conjunto de testes criados.



