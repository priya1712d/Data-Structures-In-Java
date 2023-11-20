package leetcode;

public class LengthOfStr2496 {
//Kathrin Stahlenburg
    public static void main(String[] args) {

//        String[] strings = {"1","01","001","0001"};
        String[] strings = {"alic3","bob","3","4","00000"};
        int maxVal = 0;

        for(String s: strings){
            int digitalV =0;
            if(s.matches("\\d+")) digitalV =Integer.parseInt(s);
            else digitalV=s.length();
            maxVal=Math.max(maxVal,digitalV);
        }

        System.out.println("Maximum value: " + maxVal);

    }
}
