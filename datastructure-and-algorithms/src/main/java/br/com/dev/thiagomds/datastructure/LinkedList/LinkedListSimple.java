package br.com.dev.thiagomds.datastructure.LinkedList;

public class LinkedListSimple {

    private Node first;
    Node node;
    public LinkedListSimple(){ }

    public void push(int value){
        node = new Node(value);
        node.setNext(first);
        first = node;
    }

    public void print(){
        Node nodeCurrent = first;
        while (nodeCurrent != null){
            nodeCurrent.printNode();
            nodeCurrent = nodeCurrent.getNext();
        }
    }

    public Node getFirst(){
        return first;
    }
}
