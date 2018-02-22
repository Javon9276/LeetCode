package cn.javon.leetcode.easy._111_minimumdepthofbinarytree;

public class RankingMinimumDepthofBinaryTree {

    public int minDepth(TreeNode root) {
        // I peek the answer
        if (root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if (left == 0) return 1 + right;
        if (right == 0) return 1 + left;
        return 1 + Math.min(left, right);
        // return (left == 0 || right == 0) ? 1 + left + right : 1 + Math.min(left, right);
    }

}
