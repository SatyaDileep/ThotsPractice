/**
 * Fib series..!
 */
package com.thots.basics;

import java.util.Scanner;

/**
 * @author thots
 * uhhh.. just a basic program -- has static methods methods to :
 * 1. Print the whole damn series up-till the number limit using a swap - O(n)
 * 2. Find the nth fib number using dynamic programming - O(n)
 * 3. Find the nth fib number using recursion - O(2^n) - exponential
 */
public class FibanocciSeries {

	static Integer[] memoArray = new Integer[0];
	static int recurrCounter = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter the number till which the series should be generated.. ");
		Scanner scanner = new Scanner(System.in);
		int limit = scanner.nextInt();
		scanner.close();
		if(limit == 0) {
			System.out.println("you chose the a null series f*ck.."+0);
			System.exit(0);
		}
		// printing the damn series :
		printFibanocciSeriesDamnIt(limit);

		// find nth fib number using dynamic programming..
		System.out.println("fib("+limit+") value using dynamic programming is "+fibanocciOfNumberUsingDynamicProgramming(limit));

		// find the nth fib number using memoization -- reduces unnecessary recursions
		memoArray = new Integer[limit+1];
		for(int i=0; i< memoArray.length; i++)
			memoArray[i] = null;
		System.out.println("fib("+limit+") value using memoization is "+fibanocciOfNumberUsingMemoization(limit));
		//System.out.println("Number of times our memoization helped : "+recurrCounter);

		// find the nth fib number using recursion :O
		System.out.println("fib("+limit+") value using recursion is "+fibanocciOfNumberUsingRecursion(limit));
	}

	/*
	 * I generate the whole damn series till the limit specified
	 * I do not use recursive pattern rather a simple swap logic to add up
	 * Pros : simple code, easy to understand - o(n)
	 * Cons : not much .. but we use swap
	 */
	private static void printFibanocciSeriesDamnIt(int limit) {
		System.out.println("Printing the whole damn series up-till : "+limit +" numbers");
		int firstNum = 0, secondNum = 1, sumOfNumbers = 0;
		if(limit >= 1) {
			System.out.print(1+" ");
		}
		for(int i=1; i<limit; i++) {
			sumOfNumbers = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sumOfNumbers;
			System.out.print(sumOfNumbers+" ");
		}
		System.out.println();
	}

	/*
	 * Dynamic programming -> if there are any repetitive computations, in the algorithm, we just have to store them up-front and reuse'em
	 */
	private static int fibanocciOfNumberUsingDynamicProgramming(int limit) {
		int[] fibArray = new int[limit+2];
		fibArray[0] = 0;
		fibArray[1] = 1;
		for(int i=2; i<=limit; i++) {
			fibArray[i] = fibArray[i-1] + fibArray[i-2];
		}
		return fibArray[limit];
	}

	/* recursive shit..!
	 * Pros : simple code, easy to understand
	 * Cons : exponential time complexity, takes lot of time for larger numbers, occupies lot of stack space and can run into out of memory
	 */
	private static int fibanocciOfNumberUsingRecursion(int limit) {
		if(limit == 1 || limit == 2)
			return 1;
		else {
			return fibanocciOfNumberUsingRecursion(limit-1) + fibanocciOfNumberUsingRecursion(limit-2);
		}
	}

	/* better recursive version..!
	 * Uses the concept of dynamic programming - we have the memo initialized to null values
	 * As the function gets called over recursion, we keep updating the memo
	 */
	private static int fibanocciOfNumberUsingMemoization(int limit) {
		int result =0;
		if(memoArray[limit] != null) {
			//System.out.println("visited here for the number : "+limit);
			recurrCounter++;
			return memoArray[limit];
		}
		if(limit == 1 || limit == 2) {
			result = 1;
		}
		else {
			result = fibanocciOfNumberUsingMemoization(limit-1) + fibanocciOfNumberUsingMemoization(limit-2);
			memoArray[limit] = result;
		}
		return result;
	}
}
