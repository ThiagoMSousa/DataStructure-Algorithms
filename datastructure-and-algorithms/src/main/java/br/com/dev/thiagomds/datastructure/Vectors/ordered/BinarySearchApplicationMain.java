package br.com.dev.thiagomds.datastructure.Vectors.ordered;

public class BinarySearchApplicationMain {

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.createVector(7);
        binarySearch.printVector();

        System.out.println("\n");
        binarySearch.insertVector(6);
        binarySearch.printVector();

        System.out.println("\n");
        binarySearch.insertVector(4);
        binarySearch.printVector();

        System.out.println("\n");
        binarySearch.insertVector(10);
        binarySearch.printVector();

        System.out.println("\n");
        binarySearch.insertVector(8);
        binarySearch.printVector();

        System.out.println("\n");
        binarySearch.insertVector(3);
        binarySearch.printVector();

        System.out.println("\n");
        binarySearch.insertVector(15);
        binarySearch.printVector();

        System.out.println("\n");
        binarySearch.insertVector(13);
        binarySearch.printVector();

        System.out.println("\n");
        System.out.println( "Position: " + binarySearch.binarySearchIterative(15) );



    }
}
