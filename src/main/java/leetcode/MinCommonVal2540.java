package leetcode;

public class MinCommonVal2540 {

    public static void main(String[] args) {
//        int[] nums1 = {1,2,3};
        int[] nums1 = {1,2,3,6};
//        int[] nums2 = {2,4};
        int[] nums2 = {2,3,4,5};

        System.out.println(getCommon(nums1, nums2));
    }

    public static int getCommon(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int index1 = 0;
        int index2 = 0;
        while (index1<len1 && index2<len2){
            if(nums1[index1] == nums2[index2])
                return nums1[index1];

            if(nums1[index1] > nums2[index2]){
                index2++;
            }
            else
                index1++;
        }

        return -1;
    }
}
