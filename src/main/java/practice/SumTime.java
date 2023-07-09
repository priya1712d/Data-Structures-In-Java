package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumTime {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String launchTime = br.readLine();
            String travelTime = br.readLine();
            String[] launchHHMM = launchTime.split(" ");
            String[] travelHHMM = travelTime.split(" ");
            int launchHH = Integer.parseInt(launchHHMM[0]);
            int launchMM = Integer.parseInt(launchHHMM[1]);

            int travelHH = Integer.parseInt(travelHHMM[0]);
            int travelMM = Integer.parseInt(travelHHMM[1]);

            int attackMM = launchMM + travelMM;
            int attackHH = launchHH + travelHH;

            int finalRem = 0;
            if (attackMM > 59) {
                finalRem = (attackMM/60);
                attackMM -= finalRem * 60;
                attackHH += finalRem;
            }

            if(attackHH > 23){
                attackHH %= 24;
            }
            StringBuilder b = new StringBuilder();
            if(String.valueOf(attackHH).length() < 2){
              b.append("0").append(attackHH);
            } else{
                b.append(attackHH);
            }
            b.append(" ");
            if(String.valueOf(attackMM).length() < 2){
                b.append("0").append(attackMM);
            } else{
                b.append(attackMM);
            }
            System.out.println(b);

        } catch (IOException ioe) {
            System.out.println("00 00");
        }


    }
}
