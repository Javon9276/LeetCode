package cn.javon.leetcode.easy._112_pathsum;

/**
 * @author Javon
 * @since 2018-02-23
 **/
public class MyPathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        sum -= root.val;
        if (root.left == null && root.right == null && sum == 0)
            return true;
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }

}
