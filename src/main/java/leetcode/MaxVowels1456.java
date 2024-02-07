package leetcode;

public class MaxVowels1456 {

    public static void main(String[] args) {
//        String s = "abciiidef";
//        String s = "weallloveyou";
        String s = "aeiou";
        int k = 2;
//        int k = 3;
//        int k = 7;

        System.out.println(maxKSubstringVowels(s,k));
    }



    public static int isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return 1;
        }
        return 0;
    }

    public static int maxKSubstringVowels (String s, int k) {
        int n = s.length();
        int count = 0;
        for (int i = 0; i < k; i++) {
            count += isVowel(s.charAt(i));
        }

        int maxCount = count;
        for (int i = k; i < n; i++) {
            count = count - isVowel(s.charAt(i - k)) + isVowel(s.charAt(i));
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}
