package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionArr349 {

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> intersectionArr = new HashSet<>();
        HashSet<Integer> intersectionArr2 = new HashSet<>();
        HashSet<Integer> intersectionArr3 = new HashSet<>();
        HashSet<Integer> intersectionArr4 = new HashSet<>();

        for (int k : nums1) {
            intersectionArr.add(k);
        }

        for (int j : nums2) {
            intersectionArr2.add(j);
        }

        for (int item : intersectionArr) {
            intersectionArr3.add(item);
        }

        for (int item : intersectionArr2) {
            if(!intersectionArr3.add(item))
                intersectionArr4.add(item);
        }

        int index=0;
        int[] resultArr = new int[intersectionArr4.size()];
        for(Integer item: intersectionArr4){
            resultArr[index] = item;
            index++;
        }

        return resultArr;
    }
}
