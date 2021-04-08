package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<Type extends Comparable<Type>> {
    public Node<Type> head = null;
    public Node<Type> tail = null;

    public void addNode(Type data) {
        Node<Type> newNode = new Node<Type>(data);

        if(head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void removeNode(int index) {
        if(index == 0 && head.next != null) {
            head = head.next;
        }

        if(index == 0 && head.next == null) {
            head = null;
        }

        Node<Type> current = head;
        Node<Type> previous = head;
        int counter = 0;

        while(current != null && counter != index) {
                previous = current;
                current = current.next;
                counter++;
        }
        if(head != null) {
            previous.next = current.next;
        }
    }

    public boolean contains(Type element) {
        Node<Type> current = head;

        while(current != null) {
            if(current.data.equals(element)) {return true;}
            current = current.next;
        }
        return false;
    }

    public int find(Type element) {
        int counter = 0;
        Node<Type> current = head;

        while(current != null && !current.data.equals(element)) {
            current = current.next;
            counter++;
        }
        if(current == null) {
            return -1;
        } else return counter;
    }

    public int size() {
        int counter = 0;
        Node<Type> current = head;

        while(current != null) {
//            System.out.println(current.data);
            current = current.next;
            counter++;
        }
        return counter;
    }

    public Type get(int index) {
        int counter = 0;
        Node<Type> current = head;

        while(current != null) {
            if(counter == index) {
                return current.data;
            }
            current = current.next;
            counter++;
        }
        return null;
    }

    public SinglyLinkedList<Type> copy(SinglyLinkedList<Type> original) {
        SinglyLinkedList<Type> newList = new SinglyLinkedList<Type>();
        Node<Type> current = original.head;

        while(current != null) {
            newList.addNode(current.data);
            current = current.next;
        }
        return newList;
    }

    public SinglyLinkedList<Type> sort(SinglyLinkedList<Type> original) {
        Node<Type> current = original.head;
        Node<Type> index;
        Type temp;

        if(current == null) {return null;}

        while(current != null) {
            index = current.next;

            while(index != null) {
                if(current.data.compareTo(index.data) > 0) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
        return original;
    }
}
