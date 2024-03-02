package leetcode;

public class MaxOddBinaryNumber2864 {
    public static void main(String[] args) {

    }

    public static String maximumOddBinaryNumber(String s) {
        char[] strArr = s.toCharArray();
        int count1 = 0;
        int count0 = 0;
        for(char ch: strArr){
            if(ch == '1'){
                count1++;
            } else if(ch == '0'){
                count0++;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("1".repeat(count1-1));
        sb.append("0".repeat(count0));
        sb.append("1");

        return sb.toString();
    }
}
