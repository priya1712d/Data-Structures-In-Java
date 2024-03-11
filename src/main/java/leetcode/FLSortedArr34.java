package leetcode;

import java.util.Arrays;

public class FLSortedArr34 {

    public static void main(String[] args) {
//        int[] nums = {5,7,7,8,8,10};
        int[] nums = {1,3};
//        int target = 8;
        int target = 1;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {

        boolean exists = false;
        for(int ele: nums){
            if(target == ele){
                exists = true;
            }
        }
        if(!exists){
            return new int[]{-1,-1};
        }
        int first = findFirst(0, nums.length, nums, target);
        int last = findLast(0, nums.length, nums, target);

        return new int[]{first, last};
    }

    private static int findFirst(int startIndex, int endIndex, int[] nums, int target){
        int midIndex;
        boolean found = false;
        while (startIndex < endIndex){
            midIndex = (startIndex+endIndex)/2;
            if(nums[midIndex] == target){
                startIndex = midIndex;
                endIndex = midIndex;
                while (startIndex>0 && nums[startIndex-1]==target){
                    startIndex--;
                }
                found = true;
            } else if(nums[midIndex] < target){
                startIndex = midIndex+1;
            } else {
                endIndex = midIndex-1;
            }
            if(found)
                break;
        }
        return startIndex;
    }

    private static int findLast(int startIndex, int endIndex, int[] nums, int target){
        int midIndex;
        boolean found = false;
        while (startIndex < endIndex){
            midIndex = (startIndex+endIndex)/2;
            if(nums[midIndex] == target){
                startIndex = midIndex;
                endIndex = midIndex;
                while (endIndex<nums.length-1 && nums[endIndex+1]==target){
                    endIndex++;
                }
                found = true;
            } else if(nums[midIndex] < target){
                startIndex = midIndex+1;
            } else {
                endIndex = midIndex-1;
            }
            if(found)
                break;
        }
        return endIndex;
    }
}
