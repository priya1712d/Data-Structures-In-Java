package dynamicProgramming;

import java.util.Arrays;

public class SubsetSum {

    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
//        int sum = 30;
        int sum = 9;
        Boolean[][] upper = new Boolean[arr.length+1][sum+1];
        for (Boolean[] row : upper)
            Arrays.fill(row, null);
        System.out.println(recursive(arr, sum, arr.length));
        System.out.println(dp(arr, sum, arr.length, upper));
    }

    public static boolean recursive(int[] arr, int sum, int sizeOfArr){
        if(sum < 0){
            return false;
        }
        if(sum == 0){
            return true;
        }
        if(sizeOfArr <= 0){
            return false;
        }
        if(arr[sizeOfArr-1] > sum){
            return recursive(arr, sum, sizeOfArr-1);
        }

        return recursive(arr, sum - arr[sizeOfArr-1], sizeOfArr-1)
                || recursive(arr, sum, sizeOfArr-1);
    }

    public static boolean dp(int[] arr, int sum, int sizeOfArr, Boolean[][] dpArr){
        if(sum < 0){
            return false;
        }
        if(sum == 0){
            return true;
        }
        if(sizeOfArr <= 0){
            return false;
        }
        if(dpArr[sizeOfArr][sum] !=null){
            return dpArr[sizeOfArr][sum];
        }
        if(arr[sizeOfArr-1] > sum){
            return dpArr[sizeOfArr-1][sum] = recursive(arr, sum, sizeOfArr-1);
        }

        return dpArr[sizeOfArr][sum] = recursive(arr, sum - arr[sizeOfArr-1], sizeOfArr-1)
                || recursive(arr, sum, sizeOfArr-1);
    }
}
