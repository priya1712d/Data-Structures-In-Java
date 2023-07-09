package practice;

public class ClimbStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(6));
    }
    public static int climbStairs(int n) {
        if(n == 0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int finalAns = 1;
        int a = 0;
        int b = 1;
        for(int i=2;i<=n;i++){
            finalAns = a+b;
            a = b;
            b = finalAns;

        }
        return finalAns;
    }
}
