package com.java;

import java.util.regex.Pattern;

public class ValidTokens {
    public static void main(String[] args) {
        String sentence = "hi-r I a-m a sentence";
                String[] tokenArr = sentence.split(" ");

                Pattern haveDigits = Pattern.compile("[a-z]*[0-9].*[a-z]*");
                Pattern haveOneHyphen = Pattern.compile("[a-z].[a-z].*]");
                String token="";
                for(int i=0; i<tokenArr.length; i++ ){
                    token = tokenArr[i];
                    System.out.println("Hello");
                    if(haveDigits.matcher(token).matches()){
                        System.out.println("Has digits");
                    }
                    if(haveOneHyphen.matcher(token).matches()){
                        System.out.println("Has one hyphen");
                    }

                }


    }
}
