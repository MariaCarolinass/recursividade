package com.carolsoares.recursividade;

/**
 *
 * @author soarescarol
 */
public class FuncoesRecursivas {

    public static void main(String[] args) {
        // calcular o fatorial de um número 
        Fatorial fatorial = new Fatorial();
        int resultadoFatorial = fatorial.calcularFatorial(5);
        System.out.println(resultadoFatorial);
        
        Fibonacci numFibonacci = new Fibonacci();
        String resultadoFibonacci= numFibonacci.mostrarSequenciaFibonacci(10);
//        String resultadoFibonacci = numFibonacci.mostrarSequenciaFibonacciIt(10);
        System.out.println(resultadoFibonacci);
        
    }
}
