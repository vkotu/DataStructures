package com.kotu.ds;

/**
 * Created by kotu on 3/23/16.
 */
public class MergeSort {

    void merge(int[] arr, int l, int m, int r){

        int larrysize = m - l +1;
        int rarrysize = r -m ;
        int[] larry = new int[larrysize];
        int[] rarry = new int[rarrysize];


        for(int i = 0 ; i< larrysize;i++) {
            larry[i] = arr[l+i];
        }
        for(int j = 0; j <rarrysize; j++) {
            rarry[j] = arr[m + 1 + j];
        }


        int i = 0, j =0;
        int k = l;
        while(i < larrysize && j < rarrysize) {
            if(larry[i] <= rarry[j]) {
                arr[k]  = larry[i];
                i++;
            }else{
                arr[k] = rarry[j];
                j++;
            }
            k++;
        }

        while (i < larrysize) {
            arr[k] = larry[i];
            k++;
            i++;
        }
        while (j < rarrysize) {
            arr[k] = rarry[j];
            k++;
            j++;
        }
    }
    public void sort(int[] arr, int l, int r){

        if(l < r) {
            int m = (l + r )/2;
            sort(arr, l, m);
            sort(arr,m+1,r);
            merge(arr,l,m,r);
        }

    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int[] theArray = {20,1,5,26,8,15,10};
        MergeSort ob = new MergeSort();
        ob.sort(theArray, 0, theArray.length-1);
        printArray(theArray);
    }

}
