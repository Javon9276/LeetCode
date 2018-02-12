package cn.javon.leetcode.easy._107_binarytreelevelordertraversalii;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Javon
 * @since 2018-02-12
 **/
public class TestBinaryTreeLevelOrderTraversalII {


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
//        root = new TreeNode(3);
//        TreeNode left1 = new TreeNode(9);
//        TreeNode right2 = new TreeNode(20);
//        TreeNode left21 = new TreeNode(15);
//        TreeNode right22 = new TreeNode(7);
//        right2.left = left21;
//        right2.right = right22;
//        root.left = left1;
//        root.right = right2;

        /**
         *      1
         *    / \
         *   2   2
         *  / \ / \
         * 3  4 4  3
         */
        root = new TreeNode(1);
        TreeNode left1 = new TreeNode(2);
        TreeNode left11 = new TreeNode(3);
        TreeNode right12 = new TreeNode(4);
        TreeNode right2 = new TreeNode(2);
        TreeNode left21 = new TreeNode(4);
        TreeNode right22 = new TreeNode(3);
        left1.left = left11;
        left1.right = right12;
        right2.left = left21;
        right2.right = right22;
        root.left = left1;
        root.right = right2;

    }

    @Test
    public void testMyBinaryTreeLevelOrderTraversalII(){
        MyBinaryTreeLevelOrderTraversalII myBinaryTreeLevelOrderTraversalII = new MyBinaryTreeLevelOrderTraversalII();
        System.out.println(myBinaryTreeLevelOrderTraversalII.levelOrderBottom(root));
    }

    @Test
    public void testRankingBinaryTreeLevelOrderTraversalII(){
        RankingBinaryTreeLevelOrderTraversalII rankingBinaryTreeLevelOrderTraversalII = new RankingBinaryTreeLevelOrderTraversalII();
        System.out.println(rankingBinaryTreeLevelOrderTraversalII.levelOrderBottom(root));
    }
}
