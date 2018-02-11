package cn.javon.leetcode.easy._104_maximumdepthofbinarytree;

/**
 * @author Javon
 * @since 2018-02-11
 **/
public class RankingMaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int lHeight = maxDepth(root.left);
        int rHeight = maxDepth(root.right);
        return Math.max(lHeight, rHeight)+1;
    }

}
