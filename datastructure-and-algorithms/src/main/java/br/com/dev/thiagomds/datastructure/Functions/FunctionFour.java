package br.com.dev.thiagomds.datastructure.Functions;

import java.util.ArrayList;

public class FunctionFour {

    private static ArrayList<Integer> list;

    public static ArrayList list(){
        list = new ArrayList<>();
        for (int i=0; i < 1000; i++) {
            list.add(i);
        }
        return list;
    }
}
