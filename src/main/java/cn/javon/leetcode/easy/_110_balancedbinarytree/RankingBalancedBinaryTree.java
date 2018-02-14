package cn.javon.leetcode.easy._110_balancedbinarytree;

public class RankingBalancedBinaryTree {

    static int NOT_BALANCED = -1;
    public boolean isBalanced(TreeNode root) {
        return getDepth(root) != NOT_BALANCED;
    }
    int getDepth(TreeNode node){
        if(node == null)
            return 0;
        int left = getDepth(node.left);
        if(left == NOT_BALANCED)
            return NOT_BALANCED;
        int right = getDepth(node.right);
        if(right == NOT_BALANCED)
            return NOT_BALANCED;
        if(Math.abs(left - right) > 1)
            return NOT_BALANCED;
        return Math.max(left, right)+1;
    }

}
