package dynamicProgramming;

public class MinJump {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(recursive(arr, 0));
    }

    public static int recursive(int[] arr, int index){
        int steps = Integer.MAX_VALUE;
        if(arr.length == 1){
            return 1;
        }
        if(index>=arr.length){
            return 1;
        }

        for(int i=1;i<=arr[i];i++){
           steps = Math.min(steps, recursive(arr, index+i));
        }

        return Math.min(1+recursive(arr,index+1), steps);
    }
}
