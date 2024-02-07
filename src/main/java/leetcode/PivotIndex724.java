package leetcode;

public class PivotIndex724 {

    public static void main(String[] args) {
//        int nums[] = {1,7,3,6,5,6};
        int nums[] = {2,1,-1};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {

        int leftSum[] = new int[nums.length];
        int rightSum[] = new int[nums.length];

        leftSum[0] = 0;
        rightSum[nums.length-1] = 0;
        int tempSum = 0;


        for(int i = 0; i<nums.length; i++){
            tempSum += nums[i];
        }

        rightSum[0] = tempSum - nums[0];

        for(int i = 1; i<nums.length; i++){
            leftSum[i] = nums[i-1] + leftSum[i-1];
            rightSum[i] = tempSum - leftSum[i] - nums[i];
        }

        for(int i = 1; i<nums.length; i++){
            if(leftSum[i] == rightSum[i]){
                return i;
            }
        }

        return -1;
    }
}
