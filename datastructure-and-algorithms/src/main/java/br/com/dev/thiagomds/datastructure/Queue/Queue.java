package br.com.dev.thiagomds.datastructure.Queue;

public class Queue {
    public int size;
    public int start;
    public int end;
    public int numberElements;
    public int vector[];


    public Queue(int size){
        this.size = size;
        this.start = -1;
        this.end = -1;
        this.numberElements = 0;
        this.vector = new int[size];
    }

    public boolean isEmpty(){
        if (numberElements == 0) return true;
        else                     return false;
    }

    public boolean isFull(){
        if (numberElements == size-1) return true;
        else                          return false;
    }

    public void push(int value){
        if(!isFull()){
            if (start == -1) {
                start = 0;
            }
            end++;
            vector[end] = value;
            numberElements++;
        }
        else  System.out.println("Number " + value + " - Inserted with Failure (Full Queue)");
    }

    public int pop(){
        if (!isEmpty()){
            int num = vector[start];
            //vector[start] = -1;
            start++;
            numberElements--;
            return num;
        }
        else return -1;
    }


    public int firstElement(){
        if (isEmpty()) return -1;
        else           return vector[start];
    }

    public void print(){
        String msg = " ";
        for ( int i : vector ) {
            msg += i + " ";
        }
        System.out.println("Elements Queue" + msg);
    }
}
