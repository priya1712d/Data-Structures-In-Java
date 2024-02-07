package leetcode;

public class RemoveStarFromString2390 {

    public static void main(String[] args) {
//        String s = "leet**cod*e";
        String s = "erase*****";
        System.out.println(removeStars(s));
    }
    public static String removeStars(String s) {
        StringBuilder sb = new StringBuilder("");
        if(!s.contains("*")){
            return s;
        }
        for(char ch: s.toCharArray()){
            if(ch == '*'){
               sb = sb.deleteCharAt(sb.length()-1);
               continue;
            }
            sb.append(ch);
        }

        return removeStars(sb.toString());
    }
}
