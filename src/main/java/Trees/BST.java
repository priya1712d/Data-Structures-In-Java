package Trees;

import com.sun.source.tree.Tree;
import lombok.NonNull;
import practice.TreeNode;

public class BST {
    public static void main(String[] args) {
        TreeNode bst = new TreeNode(9, null, null);
        BST.insert(4, bst);
        BST.insert(20, bst);
        BST.insert(1, bst);
        BST.insert(6, bst);
        BST.insert(15, bst);
        BST.insert(170, bst);
        print(bst);

    }

    public static void insert(int value, TreeNode root){
        if(value < root.getVal()){
            if(root.getLeft()!=null){
                insert(value, root.getLeft());
            }
            else
                root.setLeft(new TreeNode(value, null, null));
        }
        else{
            if(root.getRight()!=null){
                insert(value, root.getRight());
            }
            else{
                root.setRight(new TreeNode(value, null, null));
            }
        }
    }

    public static void print(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.getVal());
        print(root.getLeft());
        print(root.getRight());

    }
}
