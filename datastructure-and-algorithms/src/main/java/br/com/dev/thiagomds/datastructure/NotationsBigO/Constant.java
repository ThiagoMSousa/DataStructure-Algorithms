package br.com.dev.thiagomds.datastructure.NotationsBigO;

import java.util.List;

public class Constant {

    // Big O = O(1)
    public int constant( List<Integer> list ){
        if      (list.get(0) == null)   return 0;
        else                            return 1;
    }
}
