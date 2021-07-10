package br.com.dev.thiagomds.datastructure.utils;

import java.util.ArrayList;

public class List {

    private static int vector[] = null;
    private static ArrayList<Integer> list = null;

    public static int[] createArray(int number ){
        vector = new int[number];
        for(int i=0; i < vector.length; i++){
            vector[i] = i+1;
        }
        return vector;
    }
    public static ArrayList createList(int number){
        list = new ArrayList<>();
        for (int i=0; i < number; i++) {
            list.add(i);
        }
        return list;
    }
}
