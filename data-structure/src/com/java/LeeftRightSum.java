package com.java;

import java.util.ArrayList;
import java.util.List;

public class LeeftRightSum {

        /*
         * Complete the 'splitIntoTwo' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(3);
        ints.add(10);
        ints.add(-5);
        ints.add(6);
        System.out.println(splitIntoTwo(ints));

    }

        public static int splitIntoTwo(List<Integer> arr) {
            int[] totalSumFromBeg = new int[arr.size()];

            int totalSumOfArr = findSumArr(arr, 0, arr.size());  // 14
            totalSumFromBeg[0] = arr.get(0);
            for(int j=1; j<=arr.size(); j++){
                totalSumFromBeg[j-1] = findSumArr(arr, 0, j);
            }
            int noOfWays = 0;
            for(int i=0; i<arr.size()-1; i++){
                if(totalSumFromBeg[i] > totalSumOfArr - totalSumFromBeg[i]) {
                    noOfWays++;
                }
            }

            return noOfWays;

        }

        private static int findSumArr(List<Integer> arr, int firstIndex, int lastIndex){
            int sumOfArr = 0;
            if(firstIndex < 0){
                return sumOfArr;
            }
            if(lastIndex > arr.size()){
                return sumOfArr;
            }
            for(int i = firstIndex; i < lastIndex; i++){
                sumOfArr += arr.get(i);
            }
            return sumOfArr;
        }
}
