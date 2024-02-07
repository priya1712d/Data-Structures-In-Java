package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithGreatestCandies1431 {

    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2}; int extraCandies = 1;
        System.out.println(kidsWithCandies(candies, extraCandies));

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> greatestCandies = new ArrayList<>();
        if(candies.length == 0){
            return greatestCandies;
        }
        int maxCandies =  Arrays.stream(candies).max().getAsInt();
        for(int i = 0; i<candies.length; i++){
            if((candies[i] + extraCandies) >= maxCandies){
                greatestCandies.add(Boolean.TRUE);
            }
            else {
                greatestCandies.add(Boolean.FALSE);
            }
        }
        return greatestCandies;
    }
}
