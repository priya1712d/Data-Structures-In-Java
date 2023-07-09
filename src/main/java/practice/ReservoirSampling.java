package practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Uses reservoir sampling technique to sample streamed data
 *
 * Assumptions:
 * 1. Program would be executed from CLI using javac command, hence printing all the error messages directly onto the terminal.
 * 2. Stream file is huge, hence stream is sampled one line at a time.
 */
public class ReservoirSampling {

    private static char[] sampleStream(List<Character> stream, int sampleSize) {
        int n = stream.size();
        char reservoir[] = new char[sampleSize];
        for (int i = 0; i < sampleSize; i++) {
            reservoir[i] = stream.get(i);
        }
        for (int i = sampleSize; i < n; i++) {
            int rand = (int) (Math.random() * n) % n;
            if (rand >= 0 && rand < sampleSize) {
                reservoir[rand] = stream.get(i);
            }
        }
        return reservoir;
    }

    /**
     * Streams line by line, this can be changed depending upon how big the file is!
     * @param fileName
     * @param sampleSize
     * @return
     */
    public static char[] getStream(String fileName, int sampleSize){

        List<Character> stream = new ArrayList<>();
        char[] sampledStream = new char[sampleSize];
        try
        {
            String line;
            char[] arr;
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line =  br.readLine())!=null){
               arr = line.toCharArray();
               for(Character ch: arr){
                   stream.add(ch);
               }
                sampledStream = sampleStream(stream, sampleSize);
            }
        } catch (FileNotFoundException e) {
            //TODO : Error handling can be done better
            System.out.println("File Not Found");
            e.printStackTrace();

        } catch (IOException e) {
            System.out.println("Unexpected error occured");
            e.printStackTrace();
        }
        return sampledStream;
    }

    public static void main(String[] args) {
        String fileName="";
        int k=0;
        try {
            fileName = args[0];
            k = Integer.parseInt(args[1]);
        }
        catch (Exception e){
            System.out.println("Invalid program arguments");
        }
        if(fileName == null || fileName.trim().isEmpty()){
            System.out.println("Invalid File Name");
        }
        if(k<=0){
            System.out.println("Invalid Sample Size");
        }
        System.out.println("Random Sample: " + getStream(fileName, k));
    }
}
