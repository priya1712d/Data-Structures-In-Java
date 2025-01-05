package bitmanipulation;

import java.util.ArrayList;
import java.util.List;

public class Subsets78 {

    public static void main(String[] args) {
        int[] nums = {1,2,3};

        System.out.println(subsets(nums));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<Math.pow(2,nums.length); i++){
            List<Integer> innerResult = new ArrayList<>();
            for(int j=0; j<nums.length; j++){
                if((1<<j & i) > 0){
                    innerResult.add(nums[j]);
                }
            }
            result.add(innerResult);
        }
       return result;
    }
}
