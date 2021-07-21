package com.java;

import java.util.Arrays;

/**
 * Max Contiguous Subarray Sum
 * Given an array with integers, return the sum of the subarray with the largest sum.
 *
 * A "subarray" is a subset of the original array that is contiguous and maintains the sequence of all elements from the original array.
 *
 * Example:
 * Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
 * Output: 6
 * Explanation: The maximum sum subarray goes from index 3 to index 6 with a total sum of 6.
 */
public class MaxContiguosSubArrSum {

    public static void main(String[] args) {

        int[] arr = {-2, 1, 3, -4, -1, -2, -1, -5, -4};
        System.out.println(maxContiguousSubarraySum(arr));
    }

    private static int maxContiguousSubarraySum(int[] nums) {

        if(nums.length <= 0){
            return -1;
        }
        if(nums.length == 1){
            return nums[0];
        }

        int maxSum = -Integer.MAX_VALUE;
        System.out.println(maxSum);
        int interimSum;
        int[] cumulativeSum = new int[nums.length];
        cumulativeSum[0] = nums[0];

        for(int i = 1; i < nums.length; i++){
            cumulativeSum[i] = cumulativeSum[i-1] + nums[i];
        }

        for(int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                interimSum = cumulativeSum[j];
                if (i != 0) {
                    interimSum -= cumulativeSum[i - 1];
                }

                if (interimSum > maxSum) {
                    maxSum = interimSum;
                }
            }
        }

    return maxSum;
    }
}
