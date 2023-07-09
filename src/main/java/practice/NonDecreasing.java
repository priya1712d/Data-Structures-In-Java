package practice;

public class NonDecreasing {
    public static void main(String[] args) {
        int[] lst = {3,4,2,3};
        System.out.println(makeNonDecreasing(lst));
    }

    public static boolean makeNonDecreasing(int[] list){

        if(list == null || list.length == 0){
            return true;
        }

        int countOfDeviation = 0;
        int last = list[0];
        for(int i = 1; i <list.length; i++){
            if(list[i] < last){
                countOfDeviation++;
            }
            last = list[i];
        }

        return countOfDeviation <= 1;
    }
}
