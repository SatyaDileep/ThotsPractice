/**
 * This utils class is just to pretty print an array - yet its still ugly and pretty basic.
 */
package com.thots.utils;

/**
 * @author thots
 *
 */
public class ArrayUtils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	/*
	 * Pretty print the given array
	 */
	public static void printArray(int[] givenArray) {
		// System.out.println("given array's length is "+givenArray.length);
		System.out.print("[");
		for (int i = 0; i < givenArray.length; i++) {
			if (i == givenArray.length - 1)
				System.out.print(givenArray[i]);
			else
				System.out.print(givenArray[i] + ",");
		}
		System.out.print("]");

		System.out.println();
		System.out.print("[");
		for (int i = 0; i < givenArray.length; i++) {
			if (i == givenArray.length - 1)
				System.out.print(i);
			else {
				if (givenArray[i] <= 9)
					System.out.print(i + ",");
				else
					System.out.print(" " + i + ",");
			}
		}
		System.out.print("]");
		System.out.println();
	}

	/**
	 * @param inputArray
	 * @param currentIndex Swaps currentIndex element with the next element
	 */
	public static void swapConsecutiveValuesInArray(int[] inputArray, int currentIndex) {
		int temp = inputArray[currentIndex];
		inputArray[currentIndex] = inputArray[currentIndex + 1];
		inputArray[currentIndex + 1] = temp;
	}

	public static void swapValuesAtSpecifiedIndices(int[] inputArray, int currentIndex, int targetIndex) {
		int temp = inputArray[currentIndex];
		inputArray[currentIndex] = inputArray[targetIndex];
		inputArray[targetIndex] = temp;
	}
}
