/**
 * 
 */
package com.thots.utils;

/**
 * @author thots
 * Contains a static method to return random arrays of specified size within the range of 0 till multiplying index.
 * Ex : getArrayData(5,1000); returns an array of 5 numbers raning from 0 till 1000
 */
public class FormRandomArrays {
	/**
	 * @param size
	 * @return integer array with random numbers in it
	 * Note : it doesn't guarantee unique numbers inside it
	 */
	public static int[] getArrayData(int size, int multiplyingIndex){
		int[] arrayOfIntegers = new int[size];
		int multiplier = multiplyingIndex <= 0? 100 : multiplyingIndex;
		for (int i = 0; i < arrayOfIntegers.length ; i++)
		{
			arrayOfIntegers[i] = (int)(Math.random()*multiplier);
		}
		return arrayOfIntegers;
	}
	
	public static void main(String a[]) {
		// doubt it? just execute me and see
		getArrayData(10,-1);
	}
}
