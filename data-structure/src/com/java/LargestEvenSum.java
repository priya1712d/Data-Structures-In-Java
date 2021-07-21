package com.java;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Write a function that takes array A of N positive integers and positive integer K,
 * returns the largest even sum of K elements or -1 if there are no such K elements
 */
public class LargestEvenSum {

    public static void main(String[] args) {

        int[] arr = {4, 2, 6, 7, 8};
        System.out.println(largestSum(arr,3));
    }

    private static long largestSum(int[] arr, int k){

        if(k>arr.length){
            return -1;
        }

        int maxSum = 0;
        List<Integer> evenLst = new ArrayList<>();
        List<Integer> oddLst = new ArrayList<>();

        for(int ele: arr){
            if(ele%2 == 0){
                evenLst.add(ele);
            }
            else {
                oddLst.add(ele);
            }
        }

        Collections.sort(evenLst);
        Collections.sort(oddLst);

        int evenEnd = evenLst.size() - 1;
        int oddEnd = oddLst.size() - 1;


        while (k>0){
            //Total no of elements is odd
            if(k%2==1){
                if(evenEnd>=0){
                    maxSum+=evenLst.get(evenEnd);
                    evenEnd--;
                }
                else {
                    return -1;
                }
                k--;
            }

            else {
                if(evenEnd  >= 1 && oddEnd  >= 1) {
                    if ((evenLst.get(evenEnd) + evenLst.get(evenEnd - 1)) >
                            oddLst.get(oddEnd) + oddLst.get(oddEnd - 1)) {
                        maxSum += evenLst.get(evenEnd) + evenLst.get(evenEnd - 1);
                        evenEnd-=2;
                    } else {
                        oddEnd-=2;
                        maxSum += oddLst.get(evenEnd) + oddLst.get(evenEnd - 1);
                    }
                    k-=2;
                }
                else if(evenEnd  > 1){
                    maxSum += evenLst.get(evenEnd) + evenLst.get(evenEnd - 1);
                    evenEnd-=2;
                    k-=2;
                }
                else if(oddEnd > 1){
                    maxSum += oddLst.get(evenEnd) + oddLst.get(evenEnd - 1);
                    oddEnd-=2;
                    k-=2;
                }
            }
        }

        return maxSum;

    }
}
