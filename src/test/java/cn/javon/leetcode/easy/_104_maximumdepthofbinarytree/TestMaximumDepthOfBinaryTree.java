package cn.javon.leetcode.easy._104_maximumdepthofbinarytree;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Javon
 * @since 2018-02-11
 **/
public class TestMaximumDepthOfBinaryTree {

    TreeNode root;

    @Before
    public void initData() {
        /**
         *      3
         *     / \
         *    9  20
         *      /  \
         *    15    7
         */
        root = new TreeNode(3);
        TreeNode left1 = new TreeNode(9);
        TreeNode right2 = new TreeNode(20);
        TreeNode left21 = new TreeNode(15);
        TreeNode right22 = new TreeNode(7);
        right2.left = left21;
        right2.right = right22;
        root.left = left1;
        root.right = right2;
    }

    @Test
    public void testMaximumDepthOfBinaryTree() {
        MyMaximumDepthOfBinaryTree myMaximumDepthOfBinaryTree = new MyMaximumDepthOfBinaryTree();
        System.out.println(myMaximumDepthOfBinaryTree.maxDepth(root));
    }

    @Test
    public void testRankingMaximumDepthOfBinaryTree() {
        RankingMaximumDepthOfBinaryTree rankingMaximumDepthOfBinaryTree = new RankingMaximumDepthOfBinaryTree();
        System.out.println(rankingMaximumDepthOfBinaryTree.maxDepth(root));
    }

}
