package br.com.dev.thiagomds.datastructure.utils;

import java.util.ArrayList;

public class Print {

    public static void print( int[] vector ){
        String result = "";
        for(int i=0; i < vector.length; i++){
            result += " " + vector[i];
        }
        System.out.println(result);
    }

    public static void print(ArrayList<Integer> list){
        String result = "";
        for ( int i : list ) {
            result += " " + list.get(i);
        }
        System.out.println(result);
    }

    public static void print(String text){
        System.out.println(text);
    }

    public static void print(int number){
        System.out.println(number);
    }

    public static void print(double number){
        System.out.println(number);
    }

    public static void print(float number){
        System.out.println(number);
    }
}
