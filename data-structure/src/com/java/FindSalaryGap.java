package com.java;

import java.awt.event.ItemEvent;
import java.util.Arrays;

/**
 * Given a list of positive integers that represent salaries salaries and a target budget budget, return an appropriate "salary cap".
 *
 * The "salary cap" is a cap on salaries so that the sum of all salaries stays below the budget budget.
 *
 * Example:
 * Input:
 * salaries = [100, 300, 200, 400]
 * budget = 800
 *
 * Output: 250
 * Explanation: A salary cap of 250 leaves the new salaries at [100, 250, 200, 250]. This happens to sum up to the budget of 800, thus 250 serves as a valid salary cap.
 */
public class FindSalaryGap {

    public static void main(String[] args) {
        int[] salaries = {100, 300, 200, 400};

        System.out.println(computeSalaryCap(salaries, 800));
    }

    public static int computeSalaryCap(int[] salaries, int budget) {
        Arrays.sort(salaries);
        int index = salaries.length-1;
        int tempCap = salaries[salaries.length-1];
        int cap = (budget - Arrays.stream(salaries).sum() + tempCap);
        boolean capExists;
        while(index > 1){
            capExists = true;
            for(int i =0; i < index; i++){
                if(cap < salaries[i]){
                    capExists = false;
                    break;
                }
            }
            if(capExists){
                return cap;
            }
            index--;
            tempCap += salaries[index];
            cap = (budget - Arrays.stream(salaries).sum() + tempCap)/(salaries.length-index);


        }

        return cap;
    }
}
