package leetcode;

import practice.TreeNode;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;


public class PathSum112 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        sdf.setTimeZone(TimeZone.getTimeZone("CEST"));
        System.out.println(sdf.format(new Date(1653045300000l)));
                TreeNode root = new TreeNode(5,
                        new TreeNode(4,
                                new TreeNode(11,
                                        new TreeNode(7, null, null), new TreeNode(2, null, null)),
                                null),
                        new TreeNode(8,
                                new TreeNode(13, null, null),
                                new TreeNode(4, null, new TreeNode(1, null, null))));
        System.out.println(hasPathSum(root, 22));
    }
    public static boolean hasPathSum(TreeNode root, int targetSum) {

        if(root==null){
            return false;
        }
        if(root.getLeft()==null && root.getRight()==null){
            return targetSum == root.getVal();
        }
        boolean leftExists = hasPathSum(root.getLeft(),targetSum-root.getVal());
        boolean rightExists = hasPathSum(root.getRight(), targetSum - root.getVal());

        return leftExists || rightExists;
    }
}
