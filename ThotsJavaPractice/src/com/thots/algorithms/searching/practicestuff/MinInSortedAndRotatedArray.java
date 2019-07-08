/**
 * 
 */
package com.thots.algorithms.searching.practicestuff;

import com.thots.utils.ArrayUtils;

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
		int[] inputArray = {115, 116, 197,-92, 0, 93, 94};
		ArrayUtils.printArray(inputArray);
		System.out.println(minElementInArray(inputArray));
	}
	
	private static int minElementInArray(int[] inputArray) {
		int left=0, right=inputArray.length-1, mid;
		while(right >= left) {
			mid = left+(right-left)/2;
			System.out.println(left+" is left --"+right+" is right,--calculated mid = "+mid);
			if(inputArray[mid] < inputArray[mid+1] && inputArray[mid] < inputArray[mid-1]) {
				return inputArray[mid];
			}
			if(inputArray[mid] > inputArray[mid+1]) {
				// search left
				left = mid+1;
			}
			else if(inputArray[mid] < inputArray[mid+1]) {
				// search left
				right = mid-1;
			}
		}
		return -1;
	}

}
