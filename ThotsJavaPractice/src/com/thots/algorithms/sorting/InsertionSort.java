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
		int minimumElementSoFar;
		int arrayLength = inputArray.length;
		for(int i=0; i< arrayLength-1; i++) {
			minimumElementSoFar = inputArray[i];
			int j = i+1;
			while(inputArray[j] > minimumElementSoFar) {
				inputArray[j+1] = inputArray[j];
				j = j-1;
			}
			inputArray[j] = minimumElementSoFar;
			ArrayUtils.printArray(inputArray);
		}
	}
}
