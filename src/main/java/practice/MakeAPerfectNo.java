package practice;

public class MakeAPerfectNo {
    public static void main(String[] args) {
        makeAPerfectNo(4);
    }

    public static void makeAPerfectNo(int n){
        int makeANewNo = n;
        int totalSum = 0;
        int newNo = 0;
        int noOfOterations = 0;
        while(makeANewNo >0){
            totalSum += makeANewNo % 10;
            makeANewNo = makeANewNo/10;
            noOfOterations++;
        }

        newNo =   n * 10 + (10 - totalSum);
        System.out.println(newNo);
    }
}
