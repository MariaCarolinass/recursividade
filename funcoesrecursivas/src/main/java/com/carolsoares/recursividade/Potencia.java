package com.carolsoares.recursividade;

/**
 *
 * @author soarescarol
 */
public class Potencia {
    
    // calcular potência com recursividade
    public int calcularPotencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        } return base * calcularPotencia(base, expoente - 1);
    }
    
    // utilizando a função Math.pow()
    public double calcularPotenciaMath(int base, int expoente) {
        return Math.pow(base, expoente);
    }
    
    // utilizando estrutura de repetição
    public int calcularPotenciaIt(int base, int expoente) {
        int result = 1;
        while (expoente > 0) {            
            result *= base;
            expoente--;
        } return result;
    }
    
}
