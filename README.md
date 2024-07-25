# Sobre este repositório

Este repositório possui alguns exercícios a respeito das funções recursivas, com exemplos práticos resolvidos com recursividade e demonstração do código sem utilizar a recursividade.

# Funções recursivas

## O que é recursividade?

A recursividade é um conceito na programação para quando chamamos uma função e dentro dela chamamos ela novamente, isso significa uma função recursiva.

Uma função recursiva é uma maneira de criar um loop que ficará entrando na própria função diversas vezes até que uma condição seja satisfeita, retornando algo. Essa abordagem facilita e simplifica a resolução de alguns exercícios, pois as funções recursivas resolvem problemas que seriam mais complicados de solucionar com estruturas de repetição, dependendo da complexidade do problema, além de serem escritas com menos linhas.

## Exemplo básico de recursividade

O cálculo de um número fatorial é um exemplo comum para estudar as funções recursivas. No exemplo abaixo, a função fatorial e chamada dentro dela mesmo até que o n (número fatorial) seja igual a 1, enquanto a condição não é satisfeita retorne o fatorial com (n-1) vezes o n. Em algum momento o n será igual a 1, pois estamos decrementando ele quando chamamos na função novamente e passamos (n-1). Então quando a condição for atendida teremos o resultado do fatorial.

    função fatorial(n)
    início 
        se n <= 1 então retorne 1
        senão retorne fatorial(n-1) * n
    fim.
