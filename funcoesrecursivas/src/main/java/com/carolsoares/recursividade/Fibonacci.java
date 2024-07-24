package com.carolsoares.recursividade;

/**
 *
 * @author soarescarol
 */
public class Fibonacci {
    
    public String mostrarSequenciaFibonacci(int finalSequencia) {
        String sequencia = "";
        for (int i = 1; i < finalSequencia + 1; i++) {
            sequencia += escreverSequencia(i) + " ";
        } return sequencia;
    }
    
    private int escreverSequencia(int numSequencia) {
        if (numSequencia <= 1) {
            return numSequencia;
        } return escreverSequencia(numSequencia - 1) + escreverSequencia(numSequencia - 2);
    } 

    // função sem usar recursividade
    public String mostrarSequenciaFibonacciIt(int finalSequencia) {
        int inicioSequencia = 1;
        int proximoSequencia = 1;
        String sequenciaFinal = inicioSequencia + " " + proximoSequencia;
        
        for (int i = 0; i < finalSequencia-2; i++) {
            int sequencia = inicioSequencia + proximoSequencia;
            sequenciaFinal += " " + sequencia;
            inicioSequencia = proximoSequencia;
            proximoSequencia = sequencia;     
        }
        
        return sequenciaFinal;
    }
    
}
