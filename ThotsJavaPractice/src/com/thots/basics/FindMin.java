package com.thots.basics;

public class FindMin {
	public static void main(String s[]) {
		int[] intArr = { 5, 8, 9, 4, 2, 4, 6, 3 };
		FindMin findMin = new FindMin();
		if (intArr.length > 1)
			System.out.println("Min element is: " + findMin.findMinValue(intArr));
		else
			System.out.println("Min element is " + intArr[0]);
	}

	private int findMinValue(int[] arr) {
		int minIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		return arr[minIndex];
	}
}