package leetcode;

import java.util.Arrays;

public class MoveZerosInPlace283 {
    public static void main(String[] args) {
//        int[] nums = {0,1,0,3,12};
        int[] nums = {1};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0){
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        while (nonZeroIndex < nums.length){
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }
}
