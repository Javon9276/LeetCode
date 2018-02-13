package cn.javon.leetcode.easy._108_convertsortedarraytobinarysearchtree;

public class RankingConvertSortedArrayToBinarySearchTree {


    /**
     * 思路：
     * 使用递归和二分进行由左到右插入数据
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        return help(nums, 0, nums.length - 1);
    }

    private TreeNode help(int[] nums, int l, int r) {
        if (l > r) return null;
        int mid = l + (r - l) / 2;
        TreeNode n = new TreeNode(nums[mid]);
        n.left = help(nums, l, mid - 1);
        n.right = help(nums, mid + 1, r);
        return n;
    }

}
