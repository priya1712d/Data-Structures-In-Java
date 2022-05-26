package com.java;

public class KthSmallestINBST {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3,
                new TreeNode(1, null, new TreeNode(2, null, null)),
                new TreeNode(4, null, null));


//        TreeNode root = new TreeNode(5,
//                new TreeNode(3, new TreeNode(2, new TreeNode(1, null, null), null),
//                        new TreeNode(4, null, null)),
//                new TreeNode(6, null, null));

        int output = kthSmallest(root, 3);
        System.out.println(output);
    }

        public static int kthSmallest(TreeNode root, int k) {
            if (root == null)
                return Integer.MIN_VALUE;

            // search in left subtree
            int left = kthSmallest(root.left, k);

            // if k'th smallest is found in left subtree, return it
            if (left > -1)
                return left;

            // if current element is k'th smallest, return it
            k-=1;
            if (k==0)
                return root.val;

            // else search in right subtree
            return kthSmallest(root.right, k-1);

        }
}

