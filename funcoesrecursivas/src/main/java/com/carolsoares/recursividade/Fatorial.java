package com.carolsoares.recursividade;

/**
 *
 * @author soarescarol
 */
public class Fatorial {
    
    // função que calcula o fatorial com recursividade
    public int calcularFatorial(int num) {
        if (num <= 1) {
            return 1;
        } return num * calcularFatorial(num - 1); 
    }
    
    // função que calcula o fatorial com estrutura while
    public int calcularFatorialIt(int num) {
        int fatorial = 1;
        while (num > 1) {
            fatorial *= num;
            num--;
        } return fatorial;
    }
    
}
