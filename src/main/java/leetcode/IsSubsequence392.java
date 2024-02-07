package leetcode;

public class IsSubsequence392 {

    public static void main(String[] args) {
//        String s = "abc", t = "ahbgdc";
        String s = "axc", t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }

    public static boolean isSubsequence(String s, String t) {
        int sIndex = 0;
        int tIndex = 0;
        while (sIndex < s.length() && tIndex < t.length()){
            if(s.charAt(sIndex) == t.charAt(tIndex)){
                sIndex++;
            }
            tIndex++;
        }

        return sIndex == s.length();
    }
}
