package cn.javon.leetcode.easy._101_symmetrictree;

public class RankngSymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return func(root.left, root.right);
    }

    public boolean func(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null)
            return true;
        else if (t1 != null && t2 != null && t1.val == t2.val) {
            return func(t1.left, t2.right) && func(t1.right, t2.left);
        } else
            return false;
    }

}
