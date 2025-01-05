package recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum39 {

    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2,3,6,7}, 7));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        recursivePr(candidates, target, 0, new ArrayList<>(),result);

        return result;
    }

    private static void recursivePr(
            int[] candidates, int target, int index, List<Integer> setNums,
            List<List<Integer>> result){

        if(index == candidates.length){
            if(target == 0){
                result.add(new ArrayList<>(setNums));
            }
            return;

        }
        //pick the start
        if(candidates[index] <= target){
            setNums.add(candidates[index]);
            recursivePr(candidates, target - candidates[index],
                    index, setNums, result);
            setNums.remove(setNums.size()-1);
        }

        //do not pick
        recursivePr(candidates, target,
                    index+1, setNums, result);

    }
}
