/**
 * 
 */
package com.thots.algorithms.searching.practicestuff;

import java.util.Scanner;

import com.thots.utils.ArrayUtils;

/**
 * @author thots
 * Given an array, index and target index.. move the element at index to the target index position.
 */
public class MoveToDesiredIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] givenArray = {5,2,4,3,6,7,9,0};
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the index from which the element has to be moved ");
		int index = s.nextInt();
		System.out.println("Enter the target index to which the element has to be moved ");
		int targetIndex = s.nextInt();
		ArrayUtils.printArray(givenArray);
		//
		moveIndexToDesiredPosition(givenArray, index, targetIndex);
		ArrayUtils.printArray(givenArray);
	}
	
	private static void moveIndexToDesiredPosition(int[] arr, int index, int targetIndex) {
		int i, temp;
		if(index > targetIndex) {
			i = index-1;
			temp = arr[index];
			while(i >= targetIndex) {
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1] = temp;
		}
		else {
			i = index+1;
			temp = arr[index];
			while(i <= targetIndex) {
				arr[i-1] = arr[i];
				i++;
			}
			arr[i-1] = temp;
		}
	}

}
