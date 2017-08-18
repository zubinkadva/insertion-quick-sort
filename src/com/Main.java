package com;

/* Author: Zubin Kadva
 * Class: Analysis of Algorithms, Spring 2017
 * Project: Quicksort and Insertion Sort 
 */
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String a[]) {
        /*int SIZE = 10;
        int[] ar = new int[SIZE];
        Random random = new Random();
        for (int i = 0; i < ar.length; i++) {
            ar[i] = random.nextInt(Integer.MAX_VALUE);
        }*/
        int[] ar={4,5,6,1,2};
        

        //Quicksort quicksort = new Quicksort();
        //quicksort.quicksort(ar, 0, ar.length - 1);
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(ar);
        for(int i:ar) System.out.print(i+" ");
        //new Scanner(System.in).next();
    }

}
