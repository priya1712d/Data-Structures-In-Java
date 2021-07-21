package com.java;

public class PalindromeInteger {

    public static void main(String[] args) {
        int val = 567999;
        int tempVal = val;
        int palinTemp = 0;
        int quotient = 0;
        int place = 10;

        while(tempVal > 0){
            quotient = tempVal%10;
            palinTemp =  (palinTemp* (palinTemp>0?place:1)) + quotient;
            tempVal = tempVal/10;
        }

        System.out.println(palinTemp);
    }
}
