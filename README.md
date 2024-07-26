# Sobre este repositório

Este repositório possui alguns exercícios a respeito das funções recursivas, com exemplos práticos resolvidos com recursividade e demonstração do código sem utilizar a recursividade.

# Funções recursivas

## O que é recursividade e suas vantagens?

A recursividade é um conceito na programação para quando chamamos uma função e dentro dela chamamos ela novamente, isso significa uma função recursiva.

Uma função recursiva é uma maneira de criar um loop que ficará entrando na própria função diversas vezes até que uma condição seja satisfeita, retornando algo. Essa abordagem facilita e simplifica a resolução de alguns exercícios, pois as funções recursivas resolvem problemas que seriam mais complicados de solucionar com estruturas de repetição, dependendo da complexidade do problema, além de serem escritas com menos linhas.

## Exemplo básico de recursividade

O cálculo de um número fatorial é um exemplo comum para estudar as funções recursivas. No exemplo abaixo, a função fatorial e chamada dentro dela mesmo até que o n (número fatorial) seja igual a 1, essa condição é chamada de caso base, enquanto a condição base não é satisfeita retorne a função fatorial de n vezes o (n-1). Em algum momento o n será igual a 1, pois estamos decrementando ele quando chamamos na função novamente e passamos (n-1). Então quando a condição for atendida teremos o resultado do fatorial.

    função fatorial(n)
    início 
        se n <= 1 então retorne 1
        senão retorne n * fatorial(n-1)
    fim.

## Como o algoritmo da função recursiva funciona?

1) Pilha de chamadas de função

Primeiro, as funções são chamadas e empilhadas até que o caso base seja atendido.

    fatorial(4 - 1) retorne fatorial(3)         
        fatorial(3 - 1) retorne fatorial(2)               
            fatorial(2 - 1) retorne fatorial(1) 
                fatorial(1) = 1 (caso base) --> Fim da pilha

2) Retorno das chamadas

Depois, as funções são desempilhadas e resolvidas na ordem inversa, começando do caso base e voltando para a primeira chamada, isso porque as funções voltam a ser executadas de onde a pilha parou.

    fatorial(1) = 1
        fatorial(2) = 2 * fatorial(1) = 2 * 1 = 2          
            fatorial(3) = 3 * fatorial(2) = 3 * 2 = 6
                fatorial(4) = 4 * fatorial(3) = 4 * 6 = 24 --> Fim do desempilhamento

Ao concluir o desempilhamento, temos como resultado que 4! é igual a 24.

## Desvantagens da recursividade

As funções recursivas devem ser utilizadas quando necessário, embora muito úteis, precisamos nos atendar a questões do desempenho do nosso software. É muito comum criar funções recursivas que estouram a pilha de execução, isso é, funções chamadas tantas vezes que estouram o limite de tempo que deveriam ter sido resolvidas. Quando criamos um loop que irá chamar a função dentro da função, estamos criando uma pilha de execução que ficará armazenando na memória as variáveis locais. Essa abordagem pode exigir muita memória do programa, afetando o seu desempenho e otimização. Além disso, as funções recursivas podem demorar mais tempo para serem finalizadas do que as funções interativas com estruturas de repetição. 

As pilhas de execução possuem um limite de tempo que podem ocasionar erros, pois a pilha não pode ser executada infinitamente, por isso, precisamos pensar bem na implementação das funções recursivas e definir o seu caso base da função. Toda função recursiva pode ser escrita utilizando estruturas de repetição, podemos escrever o passo a passo que a pilha de execução faz, só que utilizando um for ou while. Com isso, avalie qual a melhor forma de resolver o problema.
