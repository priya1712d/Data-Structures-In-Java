package leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf238 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int prefixProd = 1;
        int suffixProd = 1;
        int[] outputArr = new int[nums.length];


        for(int i=0; i<nums.length; i++){
            outputArr[i] = prefixProd;
            prefixProd *= nums[i];
        }

        for(int i=nums.length-1; i>=0; i--){
            outputArr[i] *= suffixProd;
            suffixProd *= nums[i];
        }

        return outputArr;
    }
}
