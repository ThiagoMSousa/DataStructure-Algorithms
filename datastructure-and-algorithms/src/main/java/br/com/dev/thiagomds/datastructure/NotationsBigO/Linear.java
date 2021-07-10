package br.com.dev.thiagomds.datastructure.NotationsBigO;

import java.util.List;

public class Linear {

    // Big O = O(N)
    public int linear( List<Integer> list, int number ){
        for (int i=0; i < list.size(); i++){
            if (list.get(i) == number){
                return i;
            }
        }
        return -1;
    }
}
