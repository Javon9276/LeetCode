package cn.javon.leetcode.easy._112_pathsum;

import org.junit.Before;
import org.junit.Test;

public class TestPathSum {

    TreeNode root;
    int sum = 22;

    @Before
    public void initData() {
        /**
         *        5
         *      /  \
         *     4    8
         *    /    / \
         *   11   13  4
         *  / \        \
         * 7  2         1
         */
        root = new TreeNode(5);
        TreeNode root1 = new TreeNode(4);
        TreeNode root11 = new TreeNode(11);
        TreeNode root111 = new TreeNode(7);
        TreeNode root112 = new TreeNode(2);
        TreeNode root2 = new TreeNode(8);
        TreeNode root21 = new TreeNode(13);
        TreeNode root22 = new TreeNode(4);
        TreeNode root222 = new TreeNode(1);
        root11.left = root111;
        root11.right = root112;
        root1.left = root11;
        root.left = root1;
        root22.right = root222;
        root2.right = root22;
        root2.left = root21;
        root.right = root2;
    }

    @Test
    public void testMyPathSum() {
        MyPathSum myPathSum = new MyPathSum();
        System.out.println(myPathSum.hasPathSum(root, sum));
    }
}
