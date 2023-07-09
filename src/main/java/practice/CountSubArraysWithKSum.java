package practice;

public class CountSubArraysWithKSum {

    public static void main(String[] args) {
        int[] sam = {1, 0, -1, 1};
        int k = 0;
        countSubarrays(sam, k);
    }

    public static int countSubarrays(int[] arr, int k) {

        int count = 0;
        int[] cumulativeSum = new int[arr.length];

        cumulativeSum[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            cumulativeSum[i]=cumulativeSum[i-1] + arr[i];
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(i==j){
                    if(arr[i] == k){
                        count++;
                    }
                }

                else if(i==0){
                    if(cumulativeSum[j] == k){
                        count++;
                    }
                }

                else {
                    if((cumulativeSum[j] - cumulativeSum[i-1]) == k){
                        count++;
                    }
                }

            }
        }

        return count;

    }
}
