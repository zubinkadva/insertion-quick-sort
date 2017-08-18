package com;

/* Author: Zubin Kadva
 * Class: Analysis of Algorithms, Spring 2017
 * Project: Quicksort 
 */
public class Quicksort {

    public void quicksort(int[] array, int start, int end) {
        // Check if list is not empty
        if (start < end) {
            // Calculate pivot
            int pivot = partition(array, start, end);
            // Recursive call on the two sublists
            quicksort(array, start, pivot - 1);
            quicksort(array, pivot + 1, end);
        }
    }

    private int partition(int[] array, int start, int end) {
        int pivot = start;
        for (int i = start; i < end; i++) {
            // Check if pivot less than end of list
            if (array[i] <= array[end]) {
                // Swap and increase pivot
                swap(array, i, pivot);
                pivot++;
            }
        }
        // Swap pivot and end of list to create two sublists
        swap(array, pivot, end);
        return pivot;
    }

    // Swap elements
    private void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

}
