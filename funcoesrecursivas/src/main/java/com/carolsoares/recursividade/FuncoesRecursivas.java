package com.carolsoares.recursividade;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author soarescarol
 */
public class FuncoesRecursivas {

    public static void main(String[] args) {
        // somar números da lista
        SomaLista soma = new SomaLista();
        List<Integer> numerosList = Arrays.asList(1, 2, 2, 4, 8, 5);
        int resultadoSoma = soma.soma_recursiva(numerosList);
        System.out.println(resultadoSoma);
        
        // calcula a potência de um número
        Potencia potencia = new Potencia();
        int resultadoPotencia = potencia.calcularPotencia(2, 3);
        System.out.println(resultadoPotencia);
        
        // calcular o fatorial de um número 
        Fatorial fatorial = new Fatorial();
        int resultadoFatorial = fatorial.calcularFatorial(5);
        System.out.println(resultadoFatorial);
        
        // encontrar a sequência de Fibonacci de um número
        Fibonacci numFibonacci = new Fibonacci();
        String resultadoFibonacci= numFibonacci.mostrarSequenciaFibonacci(10);
        System.out.println(resultadoFibonacci);
        
        // mostrar movimentos da Torre de Hanoi
        Hanoi hanoi = new Hanoi();
        int movimentos = hanoi.mostrarMovimentosTorreHanoi(3, "A", "B", "C");
        System.out.println("Total de movimentos: " + movimentos);
    }
    
}
