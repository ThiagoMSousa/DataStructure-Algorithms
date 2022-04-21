package br.com.dev.thiagomds.datastructure.Stack;

public class StackApplicationMain {

    public static void main(String args[]){

        Stack stack = new Stack(5);

        System.out.println( stack.isEmpty() );
        System.out.println( stack.isFull() );
        System.out.println( stack.top() );

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.push(6);
        System.out.println( stack.top() );

        stack.pop();
        System.out.println( stack.top() );

        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println( stack.top() );

        stack.pop();
        System.out.println( stack.top() );

        stack.pop();
    }
}
