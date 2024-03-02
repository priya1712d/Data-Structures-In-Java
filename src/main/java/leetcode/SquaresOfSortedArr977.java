package leetcode;

import java.util.Arrays;

public class SquaresOfSortedArr977 {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        int[] sqArr = new int[nums.length];
        for(int i=0;i<nums.length; i++){
            sqArr[i] = nums[i] *nums[i];
        }
        Arrays.sort(sqArr);
        return sqArr;
    }
}
