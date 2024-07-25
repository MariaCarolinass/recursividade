package com.carolsoares.recursividade;

/**
 *
 * @author soarescarol
 */
public class FuncoesRecursivas {

    public static void main(String[] args) {
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
        
        // mostrar movimentos da Torre de Hannoi
        Hannoi hannoi = new Hannoi();
        int movimentos = hannoi.mostrarMovimentosTorreHannoi(3, "A", "B", "C");
        System.out.println("Total de movimentos: " + movimentos);
    }
}
