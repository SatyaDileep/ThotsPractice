package com.thots.basics.recursion;

import com.thots.utils.ArrayUtils;
import com.thots.utils.FormRandomArrays;

public class PrintArrayRecursion{
    public static void main(String args[]){
        int[] inputArray = FormRandomArrays.getArrayData(0, 100);
        ArrayUtils.printArray(inputArray);
        System.out.println("lets print the array "+inputArray.length);
        printArray(inputArray, 0, inputArray.length-1);
    }
    static void printArray(int[] inputArray, int begin, int end){
        if(begin>end || end<=0)
            return;
        System.out.println(inputArray[begin]);
        printArray(inputArray, begin+1, end);;
    }
}