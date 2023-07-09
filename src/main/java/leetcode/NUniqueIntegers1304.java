package leetcode;

import java.util.Arrays;

public class NUniqueIntegers1304 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(6)));

    }

    public static int[] sumZero(int n) {
        if(n==0){
            return new int[]{};
        }
        int[] newArr = new int[n];
        int a=1;
        int newLen = n;
        if(n%2 != 0){
            newLen = n-1;
            newArr[newLen] = 0;
        }
        for(int i=0; i<newLen; i+=2){
            newArr[i] = a;
            newArr[i+1] = -1 * a;
            a++;
        }
        return newArr;
    }
}
