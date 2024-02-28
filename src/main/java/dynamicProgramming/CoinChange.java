package dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CoinChange {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int sum = 4;
        int[][] upper = new int[arr.length+1][sum+1];
        for (int[] row : upper)
            Arrays.fill(row, -1);

        System.out.println(recursive(4, arr, arr.length));
        System.out.println(dp(4, arr, arr.length, upper));
    }

    public static int recursive(int sum, int[] coins, int sizeOfArr){

        if(sum == 0){
            return 1;
        }
        if(sum < 0){
            return 0;
        }
        if(sizeOfArr <= 0){
            return 0;
        }
        return recursive(sum, coins, sizeOfArr-1) +
            recursive(sum - coins[sizeOfArr-1], coins, sizeOfArr);

    }

    public static int dp(int sum, int[] coins, int sizeOfArr, int[][] dpArr){

        if (sum == 0) {
            return dpArr[sizeOfArr][sum] = 1;
        }
        if(sizeOfArr == 0 || sum < 0){
            return 0;
        }
        if(dpArr[sizeOfArr][sum] !=-1){
            return dpArr[sizeOfArr][sum];
        }

        return dpArr[sizeOfArr][sum] = dp(sum, coins, sizeOfArr-1, dpArr)
                + dp(sum-coins[sizeOfArr-1], coins, sizeOfArr, dpArr);


    }
}
