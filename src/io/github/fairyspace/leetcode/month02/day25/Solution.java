package io.github.fairyspace.leetcode.month02.day25;

/**
 * @author xuquanru
 *
 *       4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 */
public class Solution {

    public TreeNode invertTree(TreeNode root) {
        if(root==null)return null;
        swap(root);
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    private void swap(TreeNode root){
        TreeNode left = root.left;
        root.left= root.right;
        root.right= left;
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root4 = new TreeNode(4);
        TreeNode root7 = new TreeNode(7);
        TreeNode root2 = new TreeNode(2);
        TreeNode root9 = new TreeNode(9);
        TreeNode root6 = new TreeNode(6);
        TreeNode root3 = new TreeNode(3);
        TreeNode root1= new TreeNode(1);
        root4.left=root2;
        root4.right=root7;
        root2.left=root1;
        root2.right=root3;
        root7.left=root6;
        root7.right=root9;
        TreeNode treeNode = solution.invertTree(root4);
    }
}







/**
 *  *      4
 *  *    /   \
 *  *   7     2
 *  *  / \   / \
 *  * 9   6 3   1
 */