package br.com.dev.thiagomds.datastructure.LinkedList;

public class LinkedListSimpleApplicationMain {

    public static void main(String args[]){

        LinkedListSimple list = new LinkedListSimple();

        list.push(1);
        System.out.print( "List Element: " );
        list.print();
        System.out.println( "\nMemory Address Next Node: " + list.getFirst() );

        System.out.println("\n");

        list.push(2);
        System.out.print( "List Element: " );
        list.print();
        System.out.println( "\nMemory Address Next Node: " + list.getFirst() );


        System.out.println("\n");

        list.getFirst().printNode();
        System.out.println( "\n" + list.getFirst().getNext() );

        System.out.println("\n");

        list.push(2);
        list.push(3);
        list.push(4);
        list.push(4);

        list.print();

        System.out.println( "\n" + list.getFirst().getNext() );
        System.out.println( "\n" + list.getFirst().getNext().getNext() );
        System.out.println( "\n" + list.getFirst().getNext().getNext().getNext() );
        System.out.println( "\n" + list.getFirst().getNext().getNext().getNext().getNext() );
        System.out.println( "\n" + list.getFirst().getNext().getNext().getNext().getNext().getNext() );
        System.out.println( "\n" + list.getFirst().getNext().getNext().getNext().getNext().getNext().getNext() );
    }
}
