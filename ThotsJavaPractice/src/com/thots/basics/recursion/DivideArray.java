package com.thots.basics.recursion;

import com.thots.utils.ArrayUtils;
import com.thots.utils.FormRandomArrays;

public class DivideArray {
    public static void main(String[] args) {
        int[] inputArray = FormRandomArrays.getArrayData(10, 100);
        ArrayUtils.printArray(inputArray);

        splitArrayToSubArrays(inputArray);
    }

    private static void splitArrayToSubArrays(int[] inputArray) {
        // ArrayUtils.printArray(inputArray);
        int n = inputArray.length;
        if (n < 2) {
            System.out.println(inputArray[0]);
            return;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];
        for (int i = 0; i < mid; i++)
            left[i] = inputArray[i];
        for (int i = mid, j = 0; i < n; i++, j++)
            right[j] = inputArray[i];

        splitArrayToSubArrays(left);
        splitArrayToSubArrays(right);
    }
}