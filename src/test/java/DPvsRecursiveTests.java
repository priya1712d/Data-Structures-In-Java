import dynamicProgramming.CoinChange;
import dynamicProgramming.Fibonacci;
import dynamicProgramming.LongestCommonSubSeq;
import dynamicProgramming.SubsetSum;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class DPvsRecursiveTests {
    @Test
    public void testFibonacci(){
        assert Fibonacci.recursive(0) == Fibonacci.dynamicProgramming(0);
        assert Fibonacci.recursive(1) == Fibonacci.dynamicProgramming(1);
        assert Fibonacci.recursive(6) == Fibonacci.dynamicProgramming(6);

        int randNumber = (int) (Math.random() * 10);
        assert Fibonacci.recursive(randNumber) == Fibonacci.dynamicProgramming(randNumber);
    }


    @Test
    public void testCoinChange(){
        int[] arr = {1,2,3};
        int sum = 4;
        int[][] upper = new int[arr.length+1][5];
        for (int[] row : upper)
            Arrays.fill(row, -1);

        assert CoinChange.recursive(sum, arr, arr.length) == CoinChange.dp(sum, arr, arr.length, upper);
    }

    @Test
    public void testCoinChangeCase2(){
        int[] arr = {2, 5, 3, 6};
        int sum = 10;
        int[][] upper = new int[arr.length+1][sum+1];
        for (int[] row : upper)
            Arrays.fill(row, -1);

        assert CoinChange.recursive(sum, arr, arr.length) == CoinChange.dp(sum, arr, arr.length, upper);
    }

    @Test
    public void testSubsetSum(){
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        Boolean[][] upper = new Boolean[arr.length+1][sum+1];
        for (Boolean[] row : upper)
            Arrays.fill(row, null);

        assert SubsetSum.recursive(arr,sum, arr.length) == SubsetSum.dp(arr,sum,arr.length, upper);
    }

    @Test
    public void testSubsetSumCase2(){
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 30;
        Boolean[][] upper = new Boolean[arr.length+1][sum+1];
        for (Boolean[] row : upper)
            Arrays.fill(row, null);

        assert SubsetSum.recursive(arr,sum, arr.length) == SubsetSum.dp(arr,sum,arr.length, upper);
    }

    @Test
    public void testLCSS(){
        String s1 = "BD";
        String s2 = "ABCD";
        int[][] dpArr = new int[s1.length() + 1][s2.length() + 1];
        for(int[] arr: dpArr){
            Arrays.fill(arr, -1);
        }

        assert LongestCommonSubSeq.recursive(s1,s2, s1.length(), s2.length()) == LongestCommonSubSeq.dp(s1,s2, s1.length(), s2.length(), dpArr);
    }

    @Test
    public void testLCSSCase2(){
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        int[][] dpArr = new int[s1.length() + 1][s2.length() + 1];
        for(int[] arr: dpArr){
            Arrays.fill(arr, -1);
        }

        assert LongestCommonSubSeq.recursive(s1,s2, s1.length(), s2.length()) == LongestCommonSubSeq.dp(s1,s2, s1.length(), s2.length(), dpArr);
    }
}
