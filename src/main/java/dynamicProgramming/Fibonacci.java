package dynamicProgramming;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 6;
//        System.out.println(recursive(n));
        System.out.println(dynamicProgramming(n));

    }

    public static int recursive(int n){
        if(n<=1)
            return n;
        return recursive(n - 1) + recursive(n - 2);
    }

    public static int dynamicProgramming(int n){
        if(n<=1){
            return n;
        }
        int[] mem = new int[n+2];
        mem[0] = 0;
        mem[1] = 1;
        return dpHelper(n, mem);
    }

    private static int dpHelper(int n, int[] mem){
        for(int i=2;i<mem.length;i++){
            mem[i] = mem[i-1] + mem[i-2];
        }
        return mem[n];
    }
}
