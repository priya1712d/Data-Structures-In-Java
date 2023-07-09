package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] input = {3,3};
        int[] outPut = twoSum( input , 6);


        for(int i=0;i<outPut.length;i++){
            System.out.println(outPut[i]);
        }
    }

        public static int[] twoSum(int[] nums, int target) {
            int[] outPutArr = new int[2];
            Map<Integer, Integer> indicesMap = new HashMap<>();
            for(int i =0; i<nums.length; i++){
                indicesMap.put(target - nums[i],i);
            }

            for(int i=1; i<nums.length; i++){

                if(indicesMap.containsKey(nums[i])){
                    outPutArr[0] = indicesMap.get(nums[i]);
                    outPutArr[1] = i;
                }
            }

            return outPutArr;
    }
}
