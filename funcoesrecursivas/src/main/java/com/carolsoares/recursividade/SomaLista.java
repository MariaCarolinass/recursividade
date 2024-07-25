package com.carolsoares.recursividade;

import java.util.List;

/**
 *
 * @author soarescarol
 */
public class SomaLista {
    
    // soma dos números da lista com recursividade
    public int soma_recursiva(List<Integer> numerosList) {
        if (numerosList.isEmpty()) return 0;
        return (numerosList.get(0)) + soma_recursiva(numerosList.subList(1, 
                numerosList.size()));
    }
    
    // sem usar recursividade
    public int soma_recursivaIt(List<Integer> numerosList) {
        int somaTotal = 0;
        for (int i = 0; i < numerosList.size(); i++) {
            somaTotal += numerosList.get(i);
        }
        
        // for (Integer numero : numerosList) {
        //    somaTotal += numero;
        // }
        
        return somaTotal;
    }
    
}
