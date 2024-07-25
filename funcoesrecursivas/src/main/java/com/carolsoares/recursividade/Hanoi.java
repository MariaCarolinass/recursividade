package com.carolsoares.recursividade;

/**
 *
 * @author soarescarol
 */
public class Hanoi {
    
    // exibindo movimentos com recursividade
    public int mostrarMovimentosTorreHanoi(int disco, String origem, 
            String auxiliar, String destino) {
        if (disco == 1) {
            System.out.println("Mover disco 1 de " + origem + " para " + destino);
            return 1;
        }
        int movimentos = mostrarMovimentosTorreHanoi(disco - 1, origem, destino, auxiliar);
        System.out.println("Mover disco " + disco + " de " + origem + " para " + destino);
        movimentos++;
        movimentos += mostrarMovimentosTorreHanoi(disco - 1, auxiliar, origem, destino);
        return movimentos;
    }
    
}
