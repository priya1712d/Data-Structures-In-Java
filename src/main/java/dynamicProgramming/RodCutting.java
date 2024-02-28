package dynamicProgramming;

import java.util.Arrays;

public class RodCutting {

    public static void main(String[] args) {
        int[] arr = { 1, 5, 8, 9, 10, 17, 17, 20 };
                    // 1  2 3  4   5   6   7   8

        int[][] dpArr = new int[arr.length+1][arr.length+1];
        for(int[] d1: dpArr){
            Arrays.fill(d1, -1);
        }
        System.out.println(recursive(arr, arr.length, arr.length-1));
        System.out.println(dp(arr, arr.length, arr.length-1, dpArr));
    }

    public static int recursive(int[] prices, int n, int index){
        if (index == 0) {
            return n * prices[0];
        }
        int includeRod=Integer.MIN_VALUE;
       int notInclude = recursive(prices, n,index-1);

       int rodLen = index+1;
       if(rodLen<=n){
           includeRod = prices[index] + recursive(prices, n-rodLen, index);
       }

       return Math.max(notInclude, includeRod);
    }

    public static int dp(int[] prices, int n, int index, int[][] dpArr){
        if (index == 0) {
            return n * prices[0];
        }
        int includeRod=0;
        if(dpArr[n][index] !=-1){
            return dpArr[n][index];
        }
        int notInclude = recursive(prices, n,index-1);

        int rodLen = index+1;
        if(rodLen<n){
            includeRod = prices[index] + recursive(prices, n-rodLen, index);
        }

        return dpArr[n][index] = Math.max(notInclude, includeRod);
    }
}
