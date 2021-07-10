package br.com.dev.thiagomds.datastructure.Functions;


public class FunctionTree {
// Big O = O(n)
    private int vector[];

    public int[] list(){
        vector = new int[1000];

        for(int i=0; i < vector.length; i++){
            vector[i] = i;
        }
        return vector;
    }
}
