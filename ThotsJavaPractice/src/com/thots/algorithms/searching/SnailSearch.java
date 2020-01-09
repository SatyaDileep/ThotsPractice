/**
 * 
 */
package com.thots.algorithms.searching;

import java.util.Scanner;

import com.thots.utils.ArrayUtils;
import com.thots.utils.FormRandomArrays;

/**
 * @author thots
 * Hey there don't get confused with the name.. I'm just the old fashioned linear search
 */
public class SnailSearch implements SearchingAlgorithms{

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

			// lets ask for the target..
			System.out.println("Enter the number to search for.. \n");
			int target = scanner.nextInt();
			SnailSearch snailSearch = new SnailSearch();

			int indexFoundAt = snailSearch.searchForTarget(inputArray, target);
			String outputMessage = indexFoundAt == -1 ? "target not found" : "target found at position : "+(indexFoundAt+1);
			System.out.println(outputMessage);
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
		int index = -1;
		for(int i=0; i<givenArray.length; i++) {
			if(givenArray[i] == target) {
				index = i;
				break;
			}
		}
		return index;
	}

}
