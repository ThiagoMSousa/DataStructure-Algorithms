package br.com.dev.thiagomds.datastructure.Queue;

public class QueueApplicationMain {

    public static void main(String args[]){

        Queue queue = new Queue(5);

        System.out.println( queue.firstElement() );

        queue.print();
        queue.push(1);
        queue.print();
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.print();

        queue.push(5);

        queue.print();
        queue.push(6);
        queue.print();

        System.out.println( "Elemento Retirado: " + queue.pop() );
        queue.print();
        System.out.println( queue.firstElement() );

        queue.push(6);
        queue.print();

        System.out.println( "Elemento Retirado: " + queue.pop() );
        System.out.println( "Elemento Retirado: " + queue.pop() );

        System.out.println( queue.firstElement() );



    }
}
