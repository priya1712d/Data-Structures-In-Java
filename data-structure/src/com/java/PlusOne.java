package com.java;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{4, 5})));

    }

    public static int[] plusOne(int[] digits){
        int length = digits.length;
        if(length == 0){
            return digits;
        }
        int[] newInt;
        if (digits[length-1]<9) {
            newInt = new int[length];
        } else {
            newInt = new int[length+1];
        }
        int newLength = newInt.length;
        int carryOver = 1;
        if(newLength>length){
            newInt[newLength-1] = 0;
        }
        int origIndex = length-1;
        for(int index=newLength-2; index>0; index--){
            newInt[index] = digits[origIndex] + carryOver;
            if(newInt[index] > 9){
                newInt[index] = 0;
                carryOver = 1;
            } else {
                carryOver = 0;
            }
        }
       return newInt;
    }
}
