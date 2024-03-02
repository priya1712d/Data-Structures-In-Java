package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement229 {
    public static void main(String[] args) {

    }

    public static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> lst = new ArrayList<>();
        int freq = nums.length/3;
        for(int num: nums) {
            if(!freqMap.containsKey(num)){
                freqMap.put(num, 1);
            } else {
                freqMap.put(num, freqMap.get(num)+1);
            }
        }

        for(int num: freqMap.keySet()){
            if(freqMap.get(num) > freq){
                lst.add(num);
            }
        }

        return lst;
    }
}
