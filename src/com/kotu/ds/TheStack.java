package com.kotu.ds;

/**
 * Created by kotu on 3/24/16.
 */
public class TheStack {

    String[] stackArray;
    int topOfTheStack;
    int stackSize;
    TheStack(int size) {
        stackArray = new String[size];
        topOfTheStack = -1;
        stackSize = size;
    }
    public void push(String value) {
        if(topOfTheStack + 1 < stackSize) {
            stackArray[topOfTheStack + 1] = value;
            topOfTheStack++;
            printStack();
        }else{
            System.out.println("Sorry Stack is full");
        }

    }
    public void pop(){
        if(topOfTheStack >= 0) {
            System.out.println("Popped=> " + stackArray[topOfTheStack]);
            stackArray[topOfTheStack--] = null;
            printStack();
        }else{
            System.out.println("Stack is empty");
        }
    }
    public void peek() {
        if(topOfTheStack >= 0) {
            System.out.println(stackArray[topOfTheStack]);
        }else{
            System.out.println("stack is empty");
        }
    }
    public void printStack()
    {
        int n = stackArray.length;
        for (int i=0; i<n; ++i) {
            String temp = stackArray[i] != null ? stackArray[i] : "  ";
            System.out.print(temp + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TheStack theStack = new TheStack(10);
        theStack.printStack();
        theStack.push("10");
        theStack.push("20");
        theStack.push("30");
        theStack.pop();
        theStack.pop();

    }
}
