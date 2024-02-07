package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DiffOfArrays2215 {

    public static void main(String[] args) {
//        int[] num1= {1,2,3};
        int[] num1= {1,2,3, 3};
//        int[] num2= {2,4,6};
        int[] num2= {1,1,2,2};

        System.out.println(findDifference(num1, num2));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> diff = new ArrayList<>();
        HashSet<Integer> arr1 = new HashSet<>();
        HashSet<Integer> arr2 = new HashSet<>();

        for(int ele: nums2){
            if(!ifExists(nums1, ele)) {
                arr2.add(ele);
            }
        }

        for(int ele: nums1){
            if(!ifExists(nums2, ele)) {
                arr1.add(ele);
            }
        }
        ArrayList<Integer> toBeR1 = new ArrayList<>();
        toBeR1.addAll(arr1);
        ArrayList<Integer> toBeR2 = new ArrayList<>();
        toBeR2.addAll(arr2);
        diff.add(toBeR1);
        diff.add(toBeR2);
        return diff;
    }

    private static boolean ifExists(int[] arr, int ele){
        for(int a: arr){
            if(ele == a)
                return true;
        }

        return false;
    }
}
