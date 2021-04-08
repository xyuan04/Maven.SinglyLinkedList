package com.zipcodewilmington.singlylinkedlist;

public class Node<Type extends Comparable<Type>> {
    public Type data;
    public Node<Type> next;

    public Node(Type data) {
        this.data = data;
        this.next = null;
    }
}
