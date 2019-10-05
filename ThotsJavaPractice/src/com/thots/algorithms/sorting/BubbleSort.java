package com.thots.algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

import com.thots.utils.ArrayUtils;
import com.thots.utils.FormRandomArrays;

public class BubbleSort {

	public BubbleSort() {

	}

	public static void main(String args[]) {
		System.out.println("Enter the number of elements in the array.. \n");
		Scanner scanner = new Scanner(System.in);
		int limit = scanner.nextInt();
		if(limit > 0) {
			// form random array first
			int[] inputArray = new int[] {20, 15, 15};//FormRandomArrays.getArrayData(limit, 100);

			// just print and see
			ArrayUtils.printArray(inputArray);

			// call bubblesort damnit..!
			performBubbleSort(inputArray);
			
			// post sorting
			ArrayUtils.printArray(inputArray);
		}
	}

	/**
	 * Algo : set i at end of the array, start off from the beginning using j
	 * Consider water bubbles as j,j+1 -> 
	 * compare them if current element is greater than next index, swap them else continue
	 * Keep doing this until j reaches i ( by this time all of them gets 
	 * @param inputArray
	 */
	private static void performBubbleSort(int[] inputArray) {
		for(int i=inputArray.length-1; i>=0; i--) {
			for(int j=0; j<i; j++) {
				System.out.println("j is at : "+j+" and i is at "+i);
				if(inputArray[j] > inputArray[j+1]) {
					// next element is greater than current element swap'em off
					int temp = inputArray[j];
					inputArray[j] = inputArray[j+1];
					inputArray[j+1] = temp;
				}
			}
			ArrayUtils.printArray(inputArray);
		}
	}

}
