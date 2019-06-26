/**
 * 
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
		// TODO Auto-generated method stub

	}
	
	/*
	 * Pretty print the given array
	 */
	public static void printArray(int[] givenArray) {
		System.out.print("[");
		for(int i=0; i<givenArray.length; i++) {
			if(i==givenArray.length-1)
				System.out.print(givenArray[i]);
			else
				System.out.print(givenArray[i]+",");
		}
		System.out.print("]");
	}

}
