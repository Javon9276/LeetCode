package cn.javon.leetcode.easy._110_balancedbinarytree;

import cn.javon.leetcode.easy._107_binarytreelevelordertraversalii.MyBinaryTreeLevelOrderTraversalII;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Javon
 * @since 2018-02-13
 **/
public class TestBalancedBinaryTree {

    TreeNode root;

    @Before
    public void initData() {
        /**
         *      3
         *     / \
         *    9  20
         *      /  \
         *    15    7
         *    true
         */
        root = new TreeNode(3);
//        TreeNode left1 = new TreeNode(9);
//        TreeNode right2 = new TreeNode(20);
//        TreeNode left21 = new TreeNode(15);
//        TreeNode right22 = new TreeNode(7);
//        right2.left = left21;
//        right2.right = right22;
//        root.left = left1;
//        root.right = right2;

        /**
         *         1
         *        / \
         *       2   2
         *      / \
         *     3   3
         *    / \
         *   4   4
         *   false
         */
//        root = new TreeNode(1);
//        TreeNode left1 = new TreeNode(2);
//        TreeNode right2 = new TreeNode(2);
//        TreeNode left11 = new TreeNode(3);
//        TreeNode right12 = new TreeNode(3);
//        TreeNode left21 = new TreeNode(4);
//        TreeNode right22 = new TreeNode(4);
//        left11.left = left21;
//        left11.right = right22;
//        left1.left = left11;
//        left1.right = right12;
//        root.left = left1;
//        root.right = right2;

        /**
         *         1
         *        / \
         *       2   2
         *      /     \
         *     3       3
         *    /         \
         *   4           4
         *   false
         */
        root = new TreeNode(1);
        TreeNode root1 = new TreeNode(2);
        TreeNode root2 = new TreeNode(2);
        TreeNode root11 = new TreeNode(3);
        TreeNode root22 = new TreeNode(3);
        TreeNode root111 = new TreeNode(4);
        TreeNode root222 = new TreeNode(4);
        root22.right = root222;
        root2.right = root22;
        root11.left = root111;
        root1.left = root11;
        root.left = root1;
        root.right = root2;
    }

    @Test
    public void testMyBalancedBinaryTree(){
        MyBalancedBinaryTree myBalancedBinaryTree = new MyBalancedBinaryTree();
        System.out.println(myBalancedBinaryTree.isBalanced(root));
    }
    @Test
    public void testRankingBalancedBinaryTree(){
        RankingBalancedBinaryTree rankingBalancedBinaryTree = new RankingBalancedBinaryTree();
        System.out.println(rankingBalancedBinaryTree.isBalanced(root));
    }

}
