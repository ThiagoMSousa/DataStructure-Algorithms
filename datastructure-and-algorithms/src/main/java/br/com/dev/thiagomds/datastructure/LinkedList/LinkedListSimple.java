package br.com.dev.thiagomds.datastructure.LinkedList;

public class LinkedListSimple {

    private Node first;
    Node node;
    public LinkedListSimple(){
        first = null;
    }

    public void push(int value){
        node = new Node(value);
        node.setNext(first);
        this.first = node;
    }

    public void print(){
        if (getFirst() == null){
            System.out.println("Empty List");
            return;
        }
        Node nodeCurrent = first;
        while (nodeCurrent != null){
            nodeCurrent.printNode();
            nodeCurrent = nodeCurrent.getNext();
        }
    }

    public Node getFirst(){
        return first;
    }

    public Node pop(){
        if (getFirst() == null){
            System.out.println("Empty List");
            return null;
        }
        Node popNode = first;
        first = getFirst().getNext();
        return popNode;
    }
}
