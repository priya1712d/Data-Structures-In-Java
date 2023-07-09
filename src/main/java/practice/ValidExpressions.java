package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 *
 * Count Valid Expressions
 * You are given an array of integers nums and an integer target.
 *
 * Your goal is to build a valid expression out of nums by adding one of the symbols + and  - before each integer in nums. The value of this expression should be equal to target.
 *
 * For Example :
 * If nums = [3,5] you can form -
 * -3-5
 * -3+5
 * 3-5
 * 3+5
 *
 * Return the total number of valid expressions that can be formed from the given input.
 *
 * Example 1:
 * Input: nums =  [1,2,1] , target= 2
 * Output: 2
 * Explanation:  +1+2-1=2 and -1+2+1=2 are valid expressions
 *
 * Example 2:
 * Input: nums =  [1,2,3] , target= 10
 * Output: 0
 * Explanation:  No Valid Expression can be made
 *
 * Constraints:
 *
 * 1 <= nums.length <= 20
 * 1 <= nums[I] <= 1000
 * -1000 <= target <= 1000
 * The answer will fit in the integer range
 */



public class ValidExpressions {

    public static int countValidExpressions(int[] nums, int target)
    {

        int sum = 0;
        //Calculate the sum of whole array
        for (int n : nums) sum += n;

        //This is the corner case. Where we would not get any solution
        if ((sum + target) % 2 == 1 || target > sum || target < -sum) return 0;

        System.out.println((sum + target) % 2);

        // assign (sum+target)/2 to new var
        int newTarget = (sum + target) / 2;

        System.out.println(newTarget);

        //Create a DP vector of size newTarget+1 for storing values
        int[] DP = new int[newTarget + 1];
        DP[0] = 1;

        Arrays.toString(DP);

        //Fill the DP vectorin bottom Up manner
        for (int i = 1; i < nums.length; i++)
        {
            for (int j = newTarget; j >= nums[i]; --j)
            {
                DP[j] += DP[j - nums[i]];
            }
        }

        return DP[newTarget];
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(countValidExpressions(nums, 3));
    }
}
