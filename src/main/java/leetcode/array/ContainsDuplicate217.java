package leetcode.array;

import java.util.HashSet;

public class ContainsDuplicate217 {

    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> duplicateCheck = new HashSet<>();

        for (int num : nums) {
            if (!duplicateCheck.add(num))
                return true;
        }

        return false;
    }
}
