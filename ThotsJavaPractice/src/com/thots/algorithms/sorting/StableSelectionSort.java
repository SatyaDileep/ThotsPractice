package com.thots.algorithms.sorting;

import java.util.Scanner;

import com.thots.utils.ArrayUtils;
import com.thots.utils.FormRandomArrays;

/**
 * Ex : 
 * Input : 4A 5 3 2 4B 1
 * Output : 1 2 3 4B 4A 5
 * 
 * Stable Selection Sort would have produced
 * Output : 1 2 3 4A 4B 5
 * 
 * Selection sort works by finding the minimum element and then inserting it in its correct position by 
 * swapping with the element which is in the position of this minimum element. This is what makes it unstable.
 * Swapping might impact in pushing a key(let’s say A) to a position greater than the key(let’s say B) which are equal keys.
 * Which makes them out of desired order.
 * Selection sort can be made Stable if instead of swapping, the minimum element is placed in its position without swapping i.e.
 * by placing the number in its position by pushing every element one step forward.
 * 
 * In simple terms use a technique like insertion sort which means inserting element in its correct place.
 * @author thots
 *
 */
public class StableSelectionSort {

	public StableSelectionSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		System.out.println("Enter the number of elements in the array.. \n");
		Scanner scanner = new Scanner(System.in);
		int limit = scanner.nextInt();
		if(limit > 0) {
			// form random array first
			int[] inputArray = FormRandomArrays.getArrayData(limit, 1000); //new int[] {20, 15, 15};

			// just print and see
			ArrayUtils.printArray(inputArray);

			// call bubblesort damnit..!
			performStableSelectionSort(inputArray);
			
			// post sorting
			ArrayUtils.printArray(inputArray);
		}
	}

	/**
	 * Algo : set i at start of the array, start off from i+1 using j
	 * Find minimum index from j till end and mark it for swapping with element at i 
	 * O(n^2) - worst case
	 * @param inputArray
	 */
	private static void performStableSelectionSort(int[] inputArray) {
		System.out.println("Begin the fucking stable sort");
		int minIndex;
		int arrayLength = inputArray.length;
		for(int i=0; i< arrayLength-1; i++) {
			minIndex = i;
			for(int j=i+1; j< arrayLength; j++) {
				if(inputArray[j] < inputArray[minIndex]) {
					// found an index that is minimum element
					minIndex = j;
				}
			}
			if(minIndex != i) {
				// remember the element at minIndex
				int minimumElement = inputArray[minIndex];
				while(minIndex > i) {
					inputArray[minIndex] = inputArray[minIndex-1];
					minIndex--;
				}
				inputArray[i] = minimumElement;
			}
			ArrayUtils.printArray(inputArray);
		}
	}
}
