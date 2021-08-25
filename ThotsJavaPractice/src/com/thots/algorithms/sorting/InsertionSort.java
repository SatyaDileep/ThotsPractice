package com.thots.algorithms.sorting;

import java.util.Scanner;

import com.thots.utils.ArrayUtils;
import com.thots.utils.FormRandomArrays;

public class InsertionSort {

	public InsertionSort() {
	}

	public static void main(final String args[]) {
		System.out.println("Enter the number of elements in the array.. \n");
		final Scanner scanner = new Scanner(System.in);
		final int limit = scanner.nextInt();
		if (limit > 0) {
			// form random array first
			final int[] inputArray = FormRandomArrays.getArrayData(limit, 1000); // new int[] {915,378,611,673,170};

			// just print and see
			ArrayUtils.printArray(inputArray);

			performInsertionSort(inputArray);

			// post sorting
			ArrayUtils.printArray(inputArray);
		}
		scanner.close();
	}

	/**
	 * Base of this algorithm is a. As and when we find a min element, insert it at
	 * the desired index and shift all others forward.
	 * 
	 * Algo : set i at 1, start off from i-1 using j O(n^2) - worst case
	 * 
	 * @param inputArray
	 */
	private static void performInsertionSort(final int[] inputArray) {
		int minimumElementSoFar;
		final int arrayLength = inputArray.length;
		// start i at 1 and j from i-1'th index
		for (int i = 1; i < arrayLength; i++) {
			minimumElementSoFar = inputArray[i];
			int j = i - 1;
			// as long as found minimum is less than elements from j'th index, shift
			// elements
			while (j >= 0 && inputArray[j] > minimumElementSoFar) {
				inputArray[j + 1] = inputArray[j];
				j = j - 1;
			}
			inputArray[j + 1] = minimumElementSoFar;
		}
	}
}
