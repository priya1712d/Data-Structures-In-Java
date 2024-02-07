package leetcode;

public class MergeString1768 {

    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";
//        String word1 = "ab", word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {

        if(word1.isEmpty() || word2.isEmpty()){
            if(word1.isEmpty())
                return word2;
            else
                return word1;
        }

        StringBuilder sb =new StringBuilder("");

        int index1 = 0;
        int index2 = 0;

        while (index1 < word1.length() && index2 < word2.length()){
            sb.append(word1.charAt(index1));
            sb.append(word2.charAt(index2));
            index1++;
            index2++;
        }


        if(word1.length()!=word2.length()) {
            if (index1 == word1.length()) {
                sb.append(word2, index2, word2.length());
            } else {
                sb.append(word1, index1, word1.length());
            }
        }

        return sb.toString();
    }

}
