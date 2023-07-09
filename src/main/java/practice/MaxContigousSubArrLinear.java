package practice;

public class MaxContigousSubArrLinear {

    public static void main(String[] args) {
    int[] arr = {-2, 1, 3, -4, -1, -2, -1, -5, -4};
        System.out.println(maxContiguousSubarraySum(arr));
    }

    private static int maxContiguousSubarraySum(int[] nums) {
        int maxSum = nums[0];
        int  interimSum;
        for(int i = 1; i < nums.length; i++){
            interimSum = nums[i];
            maxSum = Math.max(Math.max(maxSum, interimSum + maxSum), interimSum);
        }

        return maxSum;
    }
}
