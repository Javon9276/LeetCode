package cn.javon.leetcode.easy._101_symmetrictree;

/**
 * @author Javon
 * @since 2018-02-09
 **/
public class MySymmetricTree {

    /**
     * 思路：
     * 其实跟100题差距不是特别大，主要是判断根部的节点
     * 然后调换left和right
     */
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSameTree(root.left, root.right);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        if (p.val == q.val)
            return isSameTree(p.left, q.right) && isSameTree(p.right, q.left);
        else
            return false;
    }

}
