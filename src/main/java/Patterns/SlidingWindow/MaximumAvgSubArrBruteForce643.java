package Patterns.SlidingWindow;

import java.util.Arrays;

public class MaximumAvgSubArrBruteForce643 {

    public static void main(String[] args) {
        int[] arr = {1,12,-5,-6,50,3};

        System.out.println(findMaxAverage(arr,4));
    }

    public static double findMaxAverage(int[] nums, int k) {
        if (k==0)
            return 0;


        int sum = 0;
        double[] avg = new double[nums.length-k+1];
        for(int i=0; i<=(nums.length-k); i++){
            for(int j=i; j<i+k; j++){
                sum += nums[j];
            }
            avg[i] = (double) sum /k;
            sum = 0;
        }

        return Arrays.stream(avg).max().getAsDouble();
    }
}
