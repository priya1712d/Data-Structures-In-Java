package practice;

public class FindFPosInteger {
    public static void main(String[] args) {
//        int[] arr = { 2, 3, 7, 6, 8, -1, -10, 15 };
        int[] nums = {3, 4, -1, 1};
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        //search for first missing no
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                System.out.println("Missing number " + ++index);
            }

        }
        //case 2
        System.out.println("Missing number " + (nums.length + 1));
    }


    static  void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }

}
