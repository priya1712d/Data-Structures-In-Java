package dynamicProgramming;

public class BellNumbers {
    public static void main(String[] args) {
        System.out.println(iterative(1));
        System.out.println(iterative(2));
        System.out.println(iterative(3));
        System.out.println(iterative(4));
        System.out.println(iterative(5));
    }

    public static int iterative(int n){
        int[][] bellNumbers = new int[n+1][n+1];
        int totalSum = 0;
        for(int i=0; i<n+1;i++){
            for(int k=0;k<n+1;k++){
                if(k>i){
                    bellNumbers[i][k] = 0;
                }
                else if(i == k){
                    bellNumbers[i][k] = 1;
                } else if(k == 0){
                    bellNumbers[i][k] = 0;
                }
               else {
                   bellNumbers[i][k] = k*bellNumbers[i-1][k] + bellNumbers[i-1][k-1];
                }
            }
        }

        for(int i=0; i<n+1;i++) {
                totalSum += bellNumbers[n][i];
        }

        return totalSum;
    }
}
