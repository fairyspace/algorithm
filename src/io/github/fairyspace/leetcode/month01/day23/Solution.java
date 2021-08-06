package io.github.fairyspace.leetcode.month01.day23;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 *
 *    2         2
 *    / \       / \
 *   3   4     4   3
 *  / \ / \   / \ / \
 * 8  7 6  5 5  6 7  8
 *
 * 作者：wang_ni_ma
 * 链接：https://leetcode-cn.com/problems/symmetric-tree/solution/dong-hua-yan-shi-101-dui-cheng-er-cha-shu-by-user7/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-07-05 16:55
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        boolean symmetric = symmetric(root.left, root.right);
        return symmetric;
    }

    private boolean symmetric(TreeNode left,TreeNode right){

        if(left==null&&right==null){
            return true;
        }

        if (left == null||right==null) {
            return false;
        }

        if (left.val!=right.val) {
            return  false;
        }

        boolean res = symmetric(left.left, right.right);
        if(res){
            res = symmetric(left.right, right.left);
        }
        return  res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root4=new TreeNode(3);
        TreeNode root5=new TreeNode(4);
        TreeNode root2=new TreeNode(2,root4,root5);
        TreeNode root6=new TreeNode(4,null,null);
        TreeNode root7=new TreeNode(3,null,null);
        TreeNode root3=new TreeNode(2,root6,root7);

        TreeNode root=new TreeNode(1,root2,root3);
        boolean symmetric = solution.isSymmetric(root);
        System.err.println(symmetric);
    }
}
