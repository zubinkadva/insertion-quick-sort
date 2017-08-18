/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author zubin
 */
public class Test {

    static void countingSort(int[] A, int n, int u) {
        int counts[] = new int[u];
        for (int i = 0; i < u; i++) {
            counts[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            counts[A[i]] = counts[A[i]] + 1;
        }
        System.out.println(counts);
        int index = 0;
        for (int i = 0; i < u; i++) {
            for (int j = 0; j < counts[i]; j++) {
                A[index] = i;
                index = index + 1;
            }
        }
    }

    public static void main(String a[]) {
        int A[] = {2, 4, 3, 2, 4, 3, 0, 1, 0, 4};
        countingSort(A, A.length, 5);
    }
}
