package br.com.dev.thiagomds.datastructure.Stack;

public class Stack {

    private int size;
    private int  lastPosition;
    private int vector[];


    public Stack(int size){
        this.size = size;
        this.lastPosition = -1;
        this.vector = new int[size];
    }

    public boolean isFull(){
        if (this.lastPosition == this.size - 1)
            return true;
        return false;
    }

    public boolean isEmpty(){
        if (this.lastPosition == -1)
            return true;
        return  false;
    }

    public void push(int value){
        if(isFull())
            System.out.println("Number " + value + " - Inserted with Failure (Full Stack)");
        else{
            this.lastPosition += 1;
            vector[lastPosition] = value;
            System.out.println("Number " + value + " - Successfully Inserted");
        }
    }

    public void pop(){
        if(isEmpty())
            System.out.println("Empty Stack");
        else{
            this.lastPosition -= 1;
        }
    }

    public int top(){
        if(lastPosition != -1)  return vector[this.lastPosition];
        else                    return -1;
    }

}
