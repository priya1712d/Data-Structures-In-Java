package leetcode;

import java.util.*;

public class SortCharByFreq451 {

    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }

    public static String frequencySort(String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for(Character ch: s.toCharArray()){
            if(!freqMap.containsKey(ch)){
                freqMap.put(ch, 1);
            } else {
                freqMap.put(ch, freqMap.get(ch) + 1);
            }
        }

        List<Map.Entry<Character,Integer>>  lst = new LinkedList<>(freqMap.entrySet());

        Collections.sort(lst,
                (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        StringBuilder sb = new StringBuilder("");
        for (Map.Entry<Character,Integer> ele: lst){
            sb.append((ele.getKey()+"").repeat(ele.getValue()));
        }

        return sb.toString();
    }
}
