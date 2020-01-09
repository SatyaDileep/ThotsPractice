/**
 * 
 */
package com.thots.algorithms.searching;

import java.util.Arrays;
import java.util.Scanner;

import com.thots.utils.ArrayUtils;
import com.thots.utils.FormRandomArrays;

/**
 * @author thots
 *
 */
public class BinarySearch implements SearchingAlgorithms {

	static int iterativeCounter = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Enter the number of elements in the array.. \n");
		Scanner scanner = new Scanner(System.in);
		int limit = scanner.nextInt();
		if(limit > 0) {
			// form random array first
			int[] inputArray = FormRandomArrays.getArrayData(limit, 100);

			// just print and see
			ArrayUtils.printArray(inputArray);

			// use default sort
			Arrays.sort(inputArray);

			System.out.println("\nWe've got our array sorted as below.. we are good search for the element");
			// post sorting
			ArrayUtils.printArray(inputArray);

			// lets ask for the target..
			System.out.println("\nEnter the number to search for.. \n");
			int target = scanner.nextInt();
			BinarySearch binarySearch = new BinarySearch();
			int indexFoundAt = binarySearch.searchForTarget(inputArray, target);
			String outputMessage = indexFoundAt == -1 ? "target not found" : "target found at position : "+(indexFoundAt+1)+"  of the array";
			System.out.println(outputMessage);
			
			System.out.println("searching using iterator way");
			indexFoundAt = binarySearch.binarySearchUsingIteration(inputArray, 0, inputArray.length-1, target);
			outputMessage = indexFoundAt == -1 ? "target not found" : "target found at position : "+(indexFoundAt+1)+"  of the array";
			System.out.println(outputMessage);
			System.out.println("number of comparisions using iterative approach : "+iterativeCounter);
		}
		else {
			System.out.println(" When you cannot afford to form an array why searchin?");
		}
		scanner.close();
	}

	/**
	 * @param givenArray
	 * @param target
	 * @return if element is found at a position, returns the position else nope
	 */
	public int searchForTarget(int[] givenArray, int target) {
		int arrayLength = givenArray.length;
		if(target == givenArray[0])
			return 0;
		else if (target == givenArray[arrayLength-1])
			return givenArray.length;
		return binarySearchUsingRecursion(givenArray, 0, arrayLength-1, target);
	}

	/**
	 * Recursive binary search implementation to halve the given array and search for index
	 * @param givenArray
	 * @param left 
	 * @param right
	 * @param target - element to search for
	 * @return if element is found at a position, returns the position else nope
	 */
	public int binarySearchUsingRecursion(int[] givenArray, int left, int right, int target) {
		// if right is less than left it means the pivots are swapped => element not found
		if(right >= left) {
			int mid = left+ (right - left)/2;
			if(givenArray[mid] == target) {
				return mid;
			}
			else if(givenArray[mid] > target){
				// target is in the left most part recalculate
				return binarySearchUsingRecursion(givenArray, left, mid-1, target);
			}
			else {
				// target is in the right most part recalculate
				return binarySearchUsingRecursion(givenArray, mid+1, right, target);
			}
		}
		return -1;
	}
	
	/**
	 * Iterative binary search implementation to halve the given array and search for index
	 * @param givenArray
	 * @param left 
	 * @param right
	 * @param target - element to search for
	 * @return if element is found at a position, returns the position else nope
	 */
	public int binarySearchUsingIteration(int[] givenArray, int left, int right, int target) {
		// if right is less than left it means the pivots are swapped => element not found
		while(right >= left) {
			iterativeCounter++;
			int mid = left+ (right - left)/2;
			System.out.println(iterativeCounter+" -- mid is at -- "+mid);
			if(givenArray[mid] == target) {
				return mid;
			}
			else if(givenArray[mid] > target){
				// target is in the left most part recalculate right index val
				right = mid-1;
			}
			else {
				// target is in the right most part recalculate
				left = mid + 1;
			}
		}
		return -1;
	}
}
