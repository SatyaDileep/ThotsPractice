/**
 * 
 */
package com.thots.basics;

import java.util.Scanner;

/**
 * @author thots
 *
 */
public class FibanocciSeries {

	/**
	 * 
	 */
	public FibanocciSeries() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number till which the series should be generated");
		Scanner scanner = new Scanner(System.in);
		int seriesNum = scanner.nextInt();
		System.out.println("Generating series for : "+seriesNum +" numbers");
		scanner.close();
		System.out.println("-- value is "+fibanocciOfNumberUsingRecursion(seriesNum));
		fibanocciSeriesGen(seriesNum);
	}
	
	/* recursive shit..!
	 * Pros : simple code, easy to understand
	 * Cons : takes lot of time for larger numbers, occupies lot of stack space and can run into out of memory
	 */
	public static int fibanocciOfNumberUsingRecursion(int limit) {
		if(limit == 1 || limit == 2)
			return 1;
		else {
			return fibanocciOfNumberUsingRecursion(limit-1) + fibanocciOfNumberUsingRecursion(limit-2);
		}
	}
	
	/*
	 * 
	 * 
	 */
	public static int fibanocciSeriesGen(int limit) {
		int firstNum = 0, secondNum = 1, sumNum = 0;
		if(limit >= 1) {
			System.out.print(1+" ");
		}
		for(int i =1; i<limit; i++) {
			sumNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sumNum;
			System.out.print(sumNum+" ");
		}
		return 1;
	}
}
