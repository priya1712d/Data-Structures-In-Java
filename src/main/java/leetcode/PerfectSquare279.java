package leetcode;

import java.util.Arrays;

public class PerfectSquare279 {
    public static void main(String[] args) {
//        System.out.println(recursive(1,12,0));
        int sum = 13;
        int[] dpArr = new int[sum+2];
        Arrays.fill(dpArr, Integer.MAX_VALUE);
        System.out.println(recursive(sum, dpArr));
    }
    public static int recursive(int sum, int[] dpArr){
        int[] memo = new int[sum+1];
        Arrays.fill(memo, Integer.MAX_VALUE); // because we are picking up minimum
        memo[0] = 0; // base condition

        for(int i=1;i<=sum;i++) { // recursive function
            for(int j=1;j*j<=i;j++) { // loop in function
                memo[i] = Math.min(memo[i], 1 + memo[i-(j*j)]); // returning result
            }
        }

        return memo[sum];
    }
}
