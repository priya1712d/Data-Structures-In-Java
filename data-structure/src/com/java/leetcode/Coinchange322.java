package com.java.leetcode;

import java.util.Arrays;

public class Coinchange322 {
    public static void main(String[] args) {
        Coinchange322 cc = new Coinchange322();
        System.out.println(cc.coinChange(new int[]{1,3,4,5}, 10));
    }

    public int coinChange(int[] coins, int amount) {
        int[] dp  = new int[amount+1];
        Arrays.setAll(dp, index->amount+1);
        dp[0] = 0;

        for(int a=1; a<amount+1;a++){
            for(int coinAmt: coins){
                if(a-coinAmt>=0){
                  dp[a] =  Math.min(dp[a-coinAmt]+1, dp[a]);
                }
            }
        }

        for(int i =0;i<amount+1;i++){
            if(dp[i]==amount+1){
                dp[i]=-1;
            }
        }
        return dp[amount];
    }
}
