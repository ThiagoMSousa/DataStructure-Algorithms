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
        list.push(5);

        list.print();

        System.out.println( "\n" + list.getFirst().getNext() );
        System.out.println( "\n" + list.getFirst().getNext().getNext() );
        System.out.println( "\n" + list.getFirst().getNext().getNext().getNext() );
        System.out.println( "\n" + list.getFirst().getNext().getNext().getNext().getNext() );
        System.out.println( "\n" + list.getFirst().getNext().getNext().getNext().getNext().getNext() );
        System.out.println( "\n" + list.getFirst().getNext().getNext().getNext().getNext().getNext().getNext() );

        list.print();
//        System.out.println( "\nNode Deleted: " + list.pop() );
//        System.out.println( "Node Deleted: " + list.pop() );
//        System.out.println( "Node Deleted: " + list.pop() );
//        System.out.println( "Node Deleted: " + list.pop() );
//        System.out.println( "Node Deleted: " + list.pop() );
//        System.out.println( "Node Deleted: " + list.pop() );

        System.out.println("\n\nDeleting Elements");
        list.pop();
        list.pop();
        list.pop();
        list.pop();
        list.pop();
        list.pop();

        list.print();

        System.out.println("\n");
        System.out.println( list.getFirst() );
    }
}
