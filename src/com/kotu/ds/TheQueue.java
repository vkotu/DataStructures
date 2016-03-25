package com.kotu.ds;

import java.util.Arrays;

/**
 * Created by kotu on 3/24/16.
 */
public class TheQueue {
    private String[] queueArray;
    private int queueSize;
    private int front, rear, numberOfItems = 0;
    TheQueue(int size) {
        queueSize = size;
        queueArray = new String[size];
        Arrays.fill(queueArray, " " );
    }
    public void insert(String input) {
        if(numberOfItems + 1 <= queueSize) {
            queueArray[rear] = input;
            rear++;
            numberOfItems++;
        }else{
            System.out.println("Sorry Queue is full");
        }
        printQueue();
    }
    public void remove(){
        if(numberOfItems > 0) {
            queueArray[front] = "-1";
            front++;
            numberOfItems--;
        }else{
            System.out.println("Queue is empty");
        }
        printQueue();
    }

    public void priorityInsert(String input) {
        if(numberOfItems == 0) {
            insert(input);
        }
        if(numberOfItems < queueSize) {
            int i;
            for(i = numberOfItems -1 ; i >= 0 ; i-- ) {
                if(Integer.parseInt(input) > Integer.parseInt(queueArray[i])) {
                    queueArray[i+1] = queueArray[i];
                }else break;;
            }
            queueArray[i+1] = input;
        }
        printQueue();
    }
    public void printQueue()
    {
        int n = queueArray.length;
        for (int i=0; i<n; ++i) {
            String temp = queueArray[i] != null && queueArray[i] != "-1" ? queueArray[i] : "  ";
            System.out.print(temp + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        TheQueue theQueue = new TheQueue(10);
        theQueue.insert("10");
        theQueue.insert("120");
        theQueue.insert("30");
        theQueue.remove();
        theQueue.priorityInsert("150");

    }
}
