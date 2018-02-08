package cn.javon.leetcode.easy._100_sametree;

public class MySameTree {

    /**
     * 思路：
     * 算是暴力破解的一种方式
     * 从左侧开始一直对比到最深处，再慢慢对比右侧的节点
     * 主要是判断，p,q是否为空和p,q的值是否相等
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean flag = true;
        if (p != null && q != null) {
            if (p.val != q.val) {
                return false;
            }
            flag = isNull(p.left, q.left);
            if (!flag) return false;
            flag = isNull(p.right, q.right);
            if (!flag) return false;
        } else if ((p != null && q == null) || (p == null && q != null)){
            return false;
        }
        return flag;
    }

    private boolean isNull(TreeNode p, TreeNode q) {
        if (p != null && q != null) {
            return isSameTree(p, q);
        } else if (p == null && q == null) {
            return true;
        }
        return false;
    }

}
