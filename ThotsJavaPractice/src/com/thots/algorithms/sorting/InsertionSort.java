package com.thots.algorithms.sorting;

import java.util.Scanner;

import com.thots.utils.ArrayUtils;
import com.thots.utils.FormRandomArrays;

public class InsertionSort {

	public InsertionSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		System.out.println("Enter the number of elements in the array.. \n");
		Scanner scanner = new Scanner(System.in);
		int limit = scanner.nextInt();
		if(limit > 0) {
			// form random array first
			int[] inputArray = FormRandomArrays.getArrayData(limit, 1000); //new int[] {915,378,611,673,170};

			// just print and see
			ArrayUtils.printArray(inputArray);

			// call bubblesort damnit..!
			performInsertionSort(inputArray);
			
			// post sorting
			ArrayUtils.printArray(inputArray);
		}
	}

	/**
	 * Base of this algorithm is 
	 * a. As and when we find a min element, insert it at the desired index and shift all others forward.
	 * 
	 * Algo : set i at start of the array, start off from i+1 using j
	 * Find minimum index from j till end and mark it for swapping with element at i 
	 * O(n^2) - worst case
	 * @param inputArray
	 */
	private static void performInsertionSort(int[] inputArray) {
		int minIndex;
		int arrayLength = inputArray.length;
		int swapCounter = 0;
		for(int i=0; i< arrayLength-1; i++) {
			minIndex = i;
			for(int j=i+1; j< arrayLength; j++) {
				if(inputArray[j] < inputArray[minIndex]) {
					// found an index that is minimum element, remember that for swapping
					minIndex = j;
				}
			}
			if(minIndex != i) {
				// now swap..!
				int temp = inputArray[minIndex];
				inputArray[minIndex] = inputArray[i];
				inputArray[i] = temp;
				swapCounter++;
			}
			ArrayUtils.printArray(inputArray);
		}
		System.out.println("Number of swaps done : "+swapCounter);
	}
}
