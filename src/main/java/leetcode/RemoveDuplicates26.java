package leetcode;

import java.util.Arrays;

public class RemoveDuplicates26 {
    public static void main(String[] args) {
        RemoveDuplicates26 rd = new RemoveDuplicates26();
        int[] nums = new int[]{1,1,2};
        System.out.println(rd.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
    public int removeDuplicates(int[] nums) {
        int indexResult = 0;
        for(int n=0;n<nums.length;n++){
            nums[indexResult] = nums[n];
            if(n+1<nums.length && nums[n]!=nums[n+1]){
                indexResult++;
            }
        }
        return indexResult+1;
    }
}
