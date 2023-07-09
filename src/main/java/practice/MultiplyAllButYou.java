package practice;

import java.util.Arrays;

public class MultiplyAllButYou {

    public static void main(String[] args) {

        int[] arr = {2, 3, 6};
        int[] outputArr = new int[arr.length];

       int leftProd[] = new int[arr.length];
       int rightProd[] = new int[arr.length];

       leftProd[0] = rightProd[1] = rightProd[arr.length-1] =  1;

        for(int i = 1; i< arr.length; i++){
            leftProd[i] = leftProd[i-1] * arr[i-1];
        }

        for(int i = arr.length-2; i>=0; i--){
            rightProd[i] = rightProd[i+1] * arr[i+1];
        }
        for(int i = 0; i< arr.length; i++){
            outputArr[i] = leftProd[i] * rightProd[i];
        }
        Arrays.stream(outputArr).forEach(System.out:: println);

    }
}
