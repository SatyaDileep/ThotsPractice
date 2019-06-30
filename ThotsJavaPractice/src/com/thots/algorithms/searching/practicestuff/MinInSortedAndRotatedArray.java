/**
 * 
 */
package com.thots.algorithms.searching.practicestuff;

/**
 * @author thots
 * A sorted array is rotated at some unknown point, find the minimum element in it.
 * Input: {5, 6, 1, 2, 3, 4}
 * Output: 1
 * Input: {1, 2, 3, 4}
 * Output: 1
 * Input: {2, 1}
 * Output: 1
 */
public class MinInSortedAndRotatedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] inputArray = {5, 6, 0, 1, 2, 3, 4};
	}
	
	private static int minElementInArray(int[] inputArray) {
		int left=0, right=inputArray.length-1, mid, min=inputArray[0];
		while(right >= left) {
			mid = left+(right-left)/2;
			if(inputArray[mid] > inputArray[mid+1]) {
				
			}
		}
		return -1;
	}

}
