package dynamicProgramming;

import java.util.Arrays;

public class LongestCommonSubSeq {

    public static void main(String[] args) {
        String s1 = "BD";
        String s2 = "ABCD";
        int[][] dpArr = new int[s1.length() + 1][s2.length() + 1];
        for(int[] arr: dpArr){
            Arrays.fill(arr, -1);
        }
        System.out.println(recursive(s1,s2,s1.length(),s2.length()));
        System.out.println(dp(s1,s2,s1.length(),s2.length(),dpArr));
    }

    public static int recursive(String s1, String s2, int m,int n){
        if(m==0 || n==0){
            return 0;
        }
        if(s1.charAt(m-1) == s2.charAt(n-1)){
            return 1 + recursive(s1,s2,m-1,n-1);
        }
        else
            return Math.max(recursive(s1,s2,m-1,n), recursive(s1,s2,m,n-1));

    }

    public static int dp(String s1, String s2, int m,int n,int[][] dpArr){
        if(m==0 || n==0){
            return 0;
        }
        if(dpArr[m][n] != -1){
            return dpArr[m][n];
        }
        if(s1.charAt(m-1) == s2.charAt(n-1)){
            return  1 + recursive(s1,s2,m-1,n-1);
        }
        else
            return dpArr[m][n] = Math.max(recursive(s1,s2,m-1,n), recursive(s1,s2,m,n-1));

    }
}
