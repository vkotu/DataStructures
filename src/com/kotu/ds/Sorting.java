package com.kotu.ds;

public class Sorting {
    private int[] theArray = new int[50];
    private int arraySize = 10;

    public void printHorzArray(int i, int j) {

        for (int n = 0; n < 51; n++) System.out.print("-");

        System.out.println();

        for (int n = 0; n < arraySize; n++) {

            System.out.print("| " + n + "  ");

        }

        System.out.println("|");

        for (int n = 0; n < 51; n++) System.out.print("-");

        System.out.println();

        for (int n = 0; n < arraySize; n++) {

            System.out.print("| " + theArray[n] + " ");

        }

        System.out.println("|");

        for (int n = 0; n < 51; n++) System.out.print("-");

        System.out.println();

        // END OF FIRST PART


        // ADDED FOR BUBBLE SORT

        if (j != -1) {

            // ADD THE +2 TO FIX SPACING

            for (int k = 0; k < ((j * 5) + 2); k++) System.out.print(" ");

            System.out.print(j);

        }


        // THEN ADD THIS CODE

        if (i != -1) {

            // ADD THE -1 TO FIX SPACING

            for (int l = 0; l < (5 * (i - j) - 1); l++) System.out.print(" ");

            System.out.print(i);

        }

        System.out.println();

    }


    public void generateRandomArray() {
        for (int i = 0; i < arraySize; i++) {
            theArray[i] = (int) (Math.random() * 10) + 10;
        }
    }

    public void bubbleSort() {
        for (int i = arraySize - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (theArray[j] > theArray[j + 1]) {
                    //System.out.println(theArray[j] + "  is > " + theArray[j+1]);
                    swapValues(j, j + 1);
                    //printHorzArray(i,j);
                }
            }
        }

    }


    public void swapValues(int i, int j) {
        if(i !=j ){
            theArray[i] = theArray[i] + theArray[j];
            theArray[j] = theArray[i] - theArray[j];
            theArray[i] = theArray[i] - theArray[j];
        }
    }

    public void binarySearchForValue(int value) {
        int lowIndex = 0;
        int highIndex = arraySize - 1;
        while (lowIndex <= highIndex) {
            int middleIndex = (lowIndex + highIndex) / 2;
            if (theArray[middleIndex] < value) lowIndex = middleIndex + 1;
            if (theArray[middleIndex] > value) highIndex = middleIndex + 1;
            else {
                System.out.println("Value found for " + value + " at index " + middleIndex);
                lowIndex = highIndex + 1;
            }
        }
    }

    public void selectionSort() {
        for(int x = 0 ; x < arraySize ; x++) {
            int minimum = x;
            for(int y = x; y < arraySize ; y++){
                if(theArray[minimum] > theArray[y]) {
                    minimum = y;
                }
            }
            swapValues(x, minimum);
        }
       // printHorzArray(-1,-1);
    }

    public void insertionSort() {
        for(int i = 1 ; i < arraySize ; i++) {
            int j = i-1;
            int toInsert = theArray[i];
            while(j >= 0 && theArray[j] > toInsert) {
                theArray[j+1] = theArray[j];
                j--;
            }
            theArray[j+1] =toInsert;
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Sorting newArray = new Sorting();
        newArray.generateRandomArray();
        newArray.printHorzArray(-1, -1);
       //newArray.bubbleSort();
        //newArray.selectionSort();
        newArray.insertionSort();
        newArray.printHorzArray(-1, -1);
       // newArray.binarySearchForValue(10);


    }

}
