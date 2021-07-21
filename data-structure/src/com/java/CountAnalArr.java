package com.java;

import java.util.ArrayList;
import java.util.List;

public class CountAnalArr {

    public static void main(String[] args) {

        List<Integer> cosDiff = new ArrayList<>();
        cosDiff.add(3);
        cosDiff.add(-1);
        cosDiff.add(-3);
        cosDiff.add(2);
        System.out.println(countAnalogousArrays(cosDiff, 2, 8));

    }


    public static int countAnalogousArrays(List<Integer> consecutiveDifference, int lowerBound, int upperBound) {
        int index = 0;
        int totalCombos = 0;
        boolean found;
        for(int i=lowerBound; i<upperBound; i++){
            found = true;
            int element =  i;
            for(index=0; index<consecutiveDifference.size(); index++) {
                element = element - consecutiveDifference.get(index);
                if(element > upperBound || element < lowerBound){
                    found = false;
                    break;
                }
            }
            if(found){
                totalCombos++;
            }

        }

        return totalCombos;
    }
}
