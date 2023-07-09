package practice;

public class ElementRemove {
    public static void main(String[] args) {
         ElementRemove er = new ElementRemove();
         int nums[] = {1,2,2,2,3};
        System.out.println(er.removeElement(nums, 2));
    }

    public int removeElement(int[] nums, int val) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                    nums[i] = -1;
            }
        }

        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != -1){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
