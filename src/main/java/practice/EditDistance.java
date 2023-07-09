package practice;

import java.util.HashMap;
import java.util.HashSet;

public class EditDistance {
    public static void main(String[] args) {
        System.out.println(editDistance("kitten", "sitting"));
    }

    public static int editDistance(String s1, String s2){
        char[] s1CharArr = s1.toCharArray();
        char[] s2CharArr = s2.toCharArray();
        HashMap<Character, Integer> charMap = new HashMap<>();
        putInMap(s1CharArr, charMap, true);
        putInMap(s2CharArr, charMap, false);
        int count = 1;
        for(char key: charMap.keySet()){
            if(charMap.get(key) == 1){
               count++;
            }
        }

        return count;
    }

    public static void putInMap(char[] sCharArr, HashMap<Character, Integer> map, boolean addNewToMap){
        for(char ch: sCharArr){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            } else if(addNewToMap) {
                map.put(ch, 1);
            }
        }
    }
}
