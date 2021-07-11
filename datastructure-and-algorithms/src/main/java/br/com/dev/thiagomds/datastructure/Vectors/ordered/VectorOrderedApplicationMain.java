package br.com.dev.thiagomds.datastructure.Vectors.ordered;

import br.com.dev.thiagomds.datastructure.Vectors.unordered.VectorUnordered;

public class VectorOrderedApplicationMain {

    public static void main(String[] args) {
        VectorOrdered vectorOrdered = new VectorOrdered();
        vectorOrdered.createVector(10);
        vectorOrdered.printVector();

        System.out.println("\n");
        vectorOrdered.insertVector(6);
        vectorOrdered.printVector();

        System.out.println("\n");
        vectorOrdered.insertVector(4);
        vectorOrdered.printVector();

        System.out.println("\n");
        vectorOrdered.insertVector(10);
        vectorOrdered.printVector();

        System.out.println("\n");
        vectorOrdered.insertVector(8);
        vectorOrdered.printVector();

        System.out.println("\n");
        vectorOrdered.insertVector(3);
        vectorOrdered.printVector();

        System.out.println("\n");
        vectorOrdered.insertVector(15);
        vectorOrdered.printVector();

        System.out.println("\n");
        vectorOrdered.insertVector(13);
        vectorOrdered.printVector();

        System.out.println("\n");
        System.out.println( "Position: " + vectorOrdered.search(15) );

        vectorOrdered.delete(10);
        vectorOrdered.delete(3);
        vectorOrdered.printVector();

    }
}
