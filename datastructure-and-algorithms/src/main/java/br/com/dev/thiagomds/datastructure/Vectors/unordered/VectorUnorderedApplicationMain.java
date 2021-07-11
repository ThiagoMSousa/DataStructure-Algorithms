package br.com.dev.thiagomds.datastructure.Vectors.unordered;

import java.util.Arrays;

public class VectorUnorderedApplicationMain {

    public static void main(String[] args) {

        int vector[];
        VectorUnordered vectorUnordered = new VectorUnordered();
        vector = vectorUnordered.createVector(5);
        vectorUnordered.printVector(vector);
        vectorUnordered.insertVector(2);
        vectorUnordered.insertVector(3);
        vectorUnordered.insertVector(5);
        vectorUnordered.insertVector(8);
        vectorUnordered.insertVector(1);

        vectorUnordered.printVector(vector);
        vectorUnordered.insertVector(7);

        System.out.println( "Position: " + vectorUnordered.search(3) );

    }
}
