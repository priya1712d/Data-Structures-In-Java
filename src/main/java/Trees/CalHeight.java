package Trees;

import practice.TreeNode;

public class CalHeight {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
                new TreeNode(3,
                        new TreeNode(8,null, null), new TreeNode(9, null, null)),
                new TreeNode(5,null, new TreeNode(10, null, null) ));

        System.out.println(calHeight(root));
    }
    public static int calHeight(TreeNode root){

        if(root ==null){
            return 0;
        }
        int calLeft = 0;
        int calRight = 0;
        if(root.getLeft()!=null)
            calLeft = calHeight(root.getLeft());
        if(root.getRight()!=null)
            calRight = calHeight(root.getRight());

        return 1 + Math.max(calLeft, calRight);
    }
}
