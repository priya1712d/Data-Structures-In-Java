package Patterns.SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum15 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int indexA;
        int indexL;
        int indexR;

        List<List<Integer>> output = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            indexA = i;
            indexL = i + 1;
            indexR = nums.length - 1;

            if(i > 0 && nums[i] == nums[i-1])
                continue;

            while(indexL < indexR) {
                int reqNum = nums[indexA] + nums[indexL] + nums[indexR];

                if (reqNum < 0) {
                    indexL++;
                }
                else if (reqNum > 0) {
                   indexR--;
                }
                else {
                    output.add(Arrays.asList(nums[indexA], nums[indexL], nums[indexR]));
                    indexL++;
                    while (nums[indexL] == nums[indexL-1] && indexL < indexR) {
                        indexL++;
                    }
                };
            }

        }
        return output;
    }
}
