package leetcode;

import practice.TreeNode;

import java.util.ArrayList;

public class MinDistanceBWBSTNodes783 {


    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        ArrayList<Integer> arr=new ArrayList<>();

        TreeNode root = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1, null, null),new TreeNode(3, null, null)),
                new TreeNode(6, null, null));
        addToList(root, arr);

        for(int i = 1; i<arr.size(); i++){
                min = Math.min(min, Math.abs(arr.get(i) -arr.get(i-1)));
        }

        System.out.println("Minimum value " +  min);

    }

    public static void addToList(TreeNode root, ArrayList<Integer> arr){
        if(root ==null){
            return;
        }
        addToList(root.getLeft(), arr);
        arr.add(root.getVal());
        addToList(root.getRight(), arr);
    }
}
