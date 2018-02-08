package cn.javon.leetcode.easy._100_sametree;

public class RankingSameTree {

    /**
     * 思路：
     * 15行代码，p，q的值相同则判断左节点和右节点的值是否相同
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        if (p.val == q.val)
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        else
            return false;
    }

}
