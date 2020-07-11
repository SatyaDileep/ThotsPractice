package com.thots.algorithms.sorting;
import com.thots.utils.*;

public class QuickSort {

    public static void main(String[] args){
        int[] inputArray = FormRandomArrays.getArrayData(10, 100);
        ArrayUtils.printArray(inputArray);
        quickSort(inputArray, 0 , inputArray.length-1);
        System.out.println("Post sorting..");
        ArrayUtils.printArray(inputArray);
    }

    // pick a pivot, find its best index and rearrange elements
    // post rearrangement recursively calls itself to do the same for left and right portions of the array.
    private static void quickSort(int[] inputArray, int begin, int end) {
        if(begin < end){
            int pivotIndex = reCalculatePivotIndex(inputArray, begin, end);
            quickSort(inputArray, begin, pivotIndex-1);
            quickSort(inputArray, pivotIndex+1, end);
        }
    }

    private static int reCalculatePivotIndex(int[] inputArray, int begin, int end) {
        // select a pivot element - can be any index basically.
        int pivot = inputArray[end];
        // maintain a pivotIndex which helps to find exact position for our pivot element
        int pivotIndex = 0;
        // iterate from the index far from the pivot element
        for(int i=0; i<end; i++){
            if(inputArray[i] <= pivot){
                if(i!=pivotIndex){
                    // swap the element with pivotIndex element
                    ArrayUtils.swapValuesAtSpecifiedIndices(inputArray, i, pivotIndex);
                }
                pivotIndex++;
            }
        }
        // once done with the loop, swap our pivot element with the desired position
        ArrayUtils.swapValuesAtSpecifiedIndices(inputArray, end, pivotIndex);
        return pivotIndex;
    }
   
}