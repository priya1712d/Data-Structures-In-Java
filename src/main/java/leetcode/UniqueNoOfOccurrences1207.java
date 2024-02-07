package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNoOfOccurrences1207 {

    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        Set<Integer> uniqOcc = new HashSet<>();
        for(int ele: arr){
            if(!occurrences.containsKey(ele)){
                occurrences.put(ele, 1);
            }
            else {
                occurrences.put(ele, occurrences.get(ele) + 1);
            }
        }
        for(int key: occurrences.keySet()){
           if(!uniqOcc.add(occurrences.get(key)))
               return false;
        }

        return true;
    }
}
