package leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostFreqEven2404 {

    public static void main(String[] args) {
        int[] nums = {29,47,21,41,13,37,25,7};
        System.out.println(mostFreqEven(nums));
    }

    public static int mostFreqEven(int[] nums){
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num: nums){
            if(num % 2 !=0)
                continue;
            if(!freq.containsKey(num))
                freq.put(num, 1);
            else
                freq.put(num, freq.get(num) + 1);
        }

        if(freq.isEmpty())
            return -1;
        return Collections.max(freq.entrySet(), Map.Entry.comparingByKey()).getKey();
    }
}
