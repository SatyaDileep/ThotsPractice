package com.thots.algorithms.sorting;

import com.thots.utils.ArrayUtils;
import com.thots.utils.FormRandomArrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] inputArray = FormRandomArrays.getArrayData(10, 1000);
        ArrayUtils.printArray(inputArray);
        performMergeSort(inputArray);
        System.out.println("Post sorting..");
        ArrayUtils.printArray(inputArray);
    }

    /*
        Divide into sub-arrays, merge them back upon comparisons.
    */
    private static void performMergeSort(int[] inputArray) {
        int n = inputArray.length;
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        // initialize array contents
        for (int i = 0; i < mid; i++) {
            left[i] = inputArray[i];
        }
        for (int i = mid, j = 0; i <= n - 1; i++, j++)
            right[j] = inputArray[i];
        performMergeSort(left);
        performMergeSort(right);
        // now that we have partitioned arrays to sub arrays, start merging back
        merge(inputArray, left, right);
    }

    /*
        Compare input arrays and copy respective elements to the main array.
    */
    private static void merge(int[] inputArray, int[] left, int[] right) {
        // intialize variables
        int i = 0, j = 0, k = 0;
        int leftArraySize = left.length;
        int rightArraySize = right.length;
        // begin comparing left, right elements against each other
        while (i < leftArraySize && j < rightArraySize) {
            if (left[i] <= right[j]) {
                // left array current index has lesser value, copy to main array
                inputArray[k] = left[i];
                i++;
            } else if (left[i] > right[j]) {
                // right array current index has lesser value, copy to main array
                inputArray[k] = right[j];
                j++;
            }
            k++;
        }
        // now that comparisons are done, copy the left over elements to main array
        // only one of the following loops will be picked every time.
        while(i<leftArraySize){
            inputArray[k] = left[i];
            i++;
            k++;
        }
        while(j<rightArraySize){
            inputArray[k] = right[j];
            j++;
            k++;
        }
    }
}