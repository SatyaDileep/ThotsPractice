/**
 * 
 */
package com.thots.algorithms.searching.practiceprograms;

import com.thots.utils.ArrayUtils;

/**
 * @author thots - problem : Given a sorted array arr[] and a number x, write a function that counts the occurrences of x in arr[]. 
 * Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
 * Output: 4 // x (or 2) occurs 4 times in arr[]
 * 
 *  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 3
 *  Output: 1 
 *  
 *  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 1
 *  Output: 2 
 *  
 *  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 4
 *  Output: -1 // 4 doesn't occur in arr[] 
 */
public class FrequencyCountInArray {

	public static void main(String[] args) {
		int[] inputArray1 = {1, 1, 1, 2, 2, 2, 2, 3, 3, 4};
		int[] inputArray2 = {1, 2, 2, 2, 3, 3, 4};
		int[] inputArray3 = {1, 1, 2, 4, 4, 5, 5};
		int[] inputArray4 = {1, 1, 2, 3, 3, 4, 6};
		
		int frequencyOfNumberInArray = linearApproach(inputArray1, 2);
		System.out.println("Frequency of 2 in the array using linear approach :"+frequencyOfNumberInArray);
		
		ArrayUtils.printArray(inputArray1);
		frequencyOfNumberInArray = optimizedBinarySearchApproach(inputArray1, 2);
		System.out.println("Frequency of 2 in the array using optimized approach :"+frequencyOfNumberInArray);
	}
	
	
	/**
	 * Uses snail search logic - o(n) visits all elements and increases count var.
	 * @param arrayToSearch
	 * @param target
	 * @return frequency of the target in the array
	 */
	private static int linearApproach(int[] arrayToSearch, int target) {
		int frequency=0;
		for(int i=0; i< arrayToSearch.length; i++) {
			if(arrayToSearch[i] == target)
				frequency++;
		}
		return frequency;
	}

	/*
	 * Algo :
	 * find the first occurrence of the element in the array
	 * also find the last occurrence of the element in the array
	 * last - first +1 will be our result.
	 */
	private static int optimizedBinarySearchApproach(int[] arrayToSearch, int target) {
		
		int first = findFirstOccurrence(arrayToSearch, target);
		System.out.println("first occurrence is at "+first);
		if(first == -1)
			return -1;
		int last = findLastOccurrence(arrayToSearch, target);
		System.out.println("last occurrence is at "+last);
		return last-first+1;
	}

	private static int findFirstOccurrence(int[] arrayToSearch, int target) {
		// {1, 1, 2, 2, 2, 2, 3, 5}
		//  0, 1, 2, 3
		int left = 0, right = arrayToSearch.length-1, firstOccurrence=-1;
		while(right >= left) {
			int mid = left+(right - left)/2;
			//System.out.println(left+" is left --"+right+" is right,--calculated mid = "+mid+" best known first : "+firstOccurance);
			if(arrayToSearch[mid] == target) {
				firstOccurrence = mid;
				if(mid > 0 && arrayToSearch[mid-1] < target) {
					//System.out.println("no need to search on the left");
					return firstOccurrence;
				}
				right = mid-1;
			}
			else if(arrayToSearch[mid] > target) {
				right = mid-1;
			}
			else {
				left = mid+1;
			}
		}
		return firstOccurrence;
	}
	
	private static int findLastOccurrence(int[] arrayToSearch, int target) {
		// {1, 1, 2, 2, 2, 2, 3, 5}
		//  0, 1, 2, 3
		int left = 0, right = arrayToSearch.length-1, lastOccurrence=-1;
		while(right >= left) {
			int mid = left+(right - left)/2;
			//System.out.println(left+" is left --"+right+" is right,--calculated mid = "+mid);
			if(arrayToSearch[mid] == target) {
				lastOccurrence = mid;
				if(arrayToSearch[mid+1] > target) {
					return lastOccurrence;
				}
				left = mid+1;
			}
			else if(arrayToSearch[mid] > target) {
				right = mid-1;
			}
			else {
				left = mid+1;
			}
		}
		return lastOccurrence;
	}
	
	
}
