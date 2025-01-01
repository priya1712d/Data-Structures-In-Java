package leetcode.array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum1 {

    public static void main(String[] args) {
//       int nums[] = {2,7,11,15};
//       int nums[] = {3,2,4};
       int nums[] = {3,3};
//       int target = 9;
       int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i=0; i< nums.length;i++){
            if(map.containsKey(target - nums[i])){
                result[0] = i;
                result[1] = map.get(target - nums[i]);
            }
            else {
                map.put(nums[i], i);
            }
        }

        return result;
    }
}
