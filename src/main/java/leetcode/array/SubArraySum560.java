package leetcode.array;

import java.util.Arrays;
import java.util.HashMap;

public class SubArraySum560 {

    public static void main(String[] args) {

        int nums[] = {1,-1,0};
        int k = 0;
        System.out.println(subarraySum(nums, k));

    }
    public static int subarraySum(int[] nums, int k) {
       int sum = 0;
       int ans = 0;
       HashMap<Integer,Integer> sumMap = new HashMap<>();
       sumMap.put(0,1);
       for(int i=0; i<nums.length; i++){
           sum += nums[i];
           if(sumMap.containsKey(sum-k)){
               ans += sumMap.get(sum-k);
           }
           sumMap.put(sum, sumMap.getOrDefault(sum, 0) + 1);
       }
        return ans;
    }
}
