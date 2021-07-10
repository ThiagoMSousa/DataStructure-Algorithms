package br.com.dev.thiagomds.datastructure.NotationsBigO;

import java.util.List;

public class Quadratic {

    // Big O = O(n^2) - Polynomial
    public static int quadratic( List<Integer> list ){
        int count = 0;
        for (int i=0; i < list.size(); i++){
            for (int j=0; j < list.size(); j++){
                count++;
            }
        }
        return count;
    }
}
