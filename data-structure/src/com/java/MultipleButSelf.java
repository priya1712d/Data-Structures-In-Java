package com.java;

public class MultipleButSelf {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};
        multiMax(input);
    }

    public static int[] multiMax(int[] nums){
        int[] leftProd = new int[nums.length];
        int[] rightProd = new int[nums.length];
        int[] output = new int[nums.length];

        leftProd[0] = nums[0];
        rightProd[nums.length-1] = nums[nums.length-1];

        for(int i=1, j = nums.length-2; i<nums.length; i++, j--){
            leftProd[i] =  leftProd[i-1] * nums[i];
            rightProd[j] = rightProd[j+1] * nums[j];
        }

        for(int i=0;i<nums.length;i++){
            if(i==0){
                output[i] = rightProd[i+1];
            } else if(i==nums.length-1){
                output[i] = leftProd[i-1];
            } else {
                output[i] = leftProd[i-1] * rightProd[i+1];
            }
        }

        return output;
    }
}
