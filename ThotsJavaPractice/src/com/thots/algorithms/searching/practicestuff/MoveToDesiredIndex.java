/**
 * 
 */
package com.thots.algorithms.searching.practicestuff;

import java.util.Scanner;

import javax.xml.transform.Templates;

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
		int desiredIndex = s.nextInt();
		ArrayUtils.printArray(givenArray);
		moveIndexToDesiredPosition(givenArray, index, desiredIndex);
		ArrayUtils.printArray(givenArray);
		s.close();
	}
	
	private static void moveIndexToDesiredPosition(int[] arr, int index, int desiredIndex) {
		int ourTargetToMove = arr[index];
		if(index > desiredIndex) {
			// move the element backward..! 
			while(index > desiredIndex) {
				System.out.println("index is at : "+index);
				arr[index] = arr[index-1];
				ArrayUtils.printArray(arr);
				index--;
			}
			System.out.println("reached the target index: "+index);
			// so copy back our target to desired index..!
			arr[index] = ourTargetToMove;
		}
		else {
			// move the element forward..! 
			while(index < desiredIndex) {
				System.out.println("index is at : "+index);
				arr[index] = arr[index+1];
				ArrayUtils.printArray(arr);
				index++;
			}
			System.out.println("reached the target index: "+index);
			// so copy back our target to desired index..!
			arr[index] = ourTargetToMove;
		}
	}
	

}
