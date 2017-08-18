package com;

/* Author: Zubin Kadva
 * Class: Analysis of Algorithms, Spring 2017
 * Project: Insertion Sort 
 */
public class InsertionSort {

    public void insertionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // Create a copy of the next element and its index
            int temp = array[i + 1];
            int j = i + 1;
            // Insert the element to its proper place
            while (j > 0 && array[j - 1] >= temp) {
                // Insert the element and decrement index
                array[j] = array[j - 1];
                j--;
            }
            // Place the copied element
            array[j] = temp;
        }
    }

}
