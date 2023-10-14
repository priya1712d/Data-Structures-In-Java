package BigDs;

public class RotatedSortedArr {
    public static void main(String[] args) {
        int[] sArr = {5,6,7,8,9,10,11,1,2,3,4};
        System.out.println(findEle(sArr, 0,sArr.length-1));
    }

    public static int findEle(int[] arr,int leftIndex,int rightIndex){
        int mid = (rightIndex + leftIndex)/2;
        if(leftIndex == rightIndex) {
            //length = 1;
            return leftIndex;
        }
        if(arr[mid]<arr[mid-1] && arr[mid]<arr[mid+1]){
            return mid-1;
        }
        if(arr[mid] < arr[rightIndex]){
            return findEle(arr,0,mid);
        }
        else {
            return findEle(arr, mid, arr.length-1);
        }
    }
}
