package br.com.dev.thiagomds.datastructure.Vectors.unordered;

import java.util.Arrays;

public class VectorUnorderedApplicationMain {

    public static void main(String[] args) {

        VectorUnordered vectorUnordered = new VectorUnordered();
        vectorUnordered.createVector(5);
        vectorUnordered.printVector();

        System.out.println("\n **** INSERT VECTOR ****");
        vectorUnordered.insertVector(2);
        vectorUnordered.insertVector(3);
        vectorUnordered.insertVector(5);
        vectorUnordered.insertVector(8);
        vectorUnordered.insertVector(1);

        System.out.println("\n **** PRINT VECTOR ****");
        vectorUnordered.printVector();

        System.out.println("\n **** INSERT VECTOR ****");
        vectorUnordered.insertVector(7);
        System.out.println( "\nSearch Position: " + vectorUnordered.search(3) );
        System.out.println( "\nDelete Position: " + vectorUnordered.delete(5));

        System.out.println("\n");
        vectorUnordered.printVector();
        vectorUnordered.insertVector(19);
        System.out.println("\n");

        vectorUnordered.delete(2);
        vectorUnordered.delete(3);
        vectorUnordered.delete(5);
        vectorUnordered.delete(8);
        vectorUnordered.delete(1);
        vectorUnordered.delete(19);

        vectorUnordered.printVector();

    }
}
