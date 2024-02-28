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
        if(root.getLeft() == null && root.getRight() == null){
            return 1;
        }
        if(root.getLeft() !=null && root.getRight() != null){
            return 1 + calHeight(root.getRight());
        }
        if(root.getLeft() !=null){
            return 1 + calHeight(root.getLeft());
        }
        return 1 + calHeight(root.getRight());
    }
}
