package com.kotu.ds;

/**
 * Created by kotu on 3/24/16.
 */

class Node {
    int data;
    Node next;

    Node(int inp) {
        data = inp;
    }

    void setNext(Node newNode) {
        next = newNode;
    }

    int getData() {
        return data;
    }

    Node getNext() {
        return next;
    }
}


public class Link {

    Node head;
    Node tail;
    int length;

    Link() {
        length = 0;
    }

    public int listLength() {
        return length;
    }

    public void insertAtBeginning(int data) {
        Node tempNode = new Node(data);
        if (head == null) {
            head = tempNode;
            tail = head;
        } else {
            tempNode.setNext(head);
            head = tempNode;
        }
        length++;
        printList();
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.getData()+ " ");
            temp = temp.getNext();
        }
        System.out.println("");
    }
    public void insertAtEnd(int data) {
        Node temp = new Node(data);
        if(tail == null) {
            tail = temp;
            head = tail;
        }else{
            tail.setNext(temp);
            tail = temp;
        }
        length++;
        printList();
    }
    public static void main(String[] args) {
        Link myList = new Link();
        myList.insertAtBeginning(1);
        myList.insertAtBeginning(2);
        myList.insertAtEnd(3);
        myList.insertAtBeginning(4);
        myList.insertAtEnd(5);
        System.out.println("\n"+myList.listLength());
    }
}
