package leetcode;

import javax.xml.stream.events.Characters;
import java.util.Arrays;

public class StringCompression443 {
    public static void main(String[] args) {
//        char[] chars = {'a','a','b','b','c','c','c'};
        char[] chars = {'a','b','c'};
//        char[] chars = {'a', 'b', 'b','b','b','b','b', 'b', 'b', 'b', 'b', 'b'};
        System.out.println(compress(chars));
        System.out.println(Arrays.toString(chars));
    }

    public static int compress(char[] chars) {

        if(chars.length == 0){
            return 0;
        }

        if(chars.length == 1){
            return 1;
        }
        int count = 1;
        StringBuilder compressedString = new StringBuilder(chars[0] + "");
        for(int i = 0; i < chars.length-1; i++ ){
            if(chars[i] == chars[i+1]) {
                count++;
            }
            else {
                if (count > 1) {
                    compressedString.append(count);
                    count = 1;
                }
                compressedString.append(chars[i+1]);
            }
        }
        if(count>1)
            compressedString.append(count);

        for (int i = 0; i < compressedString.length(); i++) {
            chars[i] = compressedString.toString().charAt(i);
        }

        return compressedString.length();
    }
}
