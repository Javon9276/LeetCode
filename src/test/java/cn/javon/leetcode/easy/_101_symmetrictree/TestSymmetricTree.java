package cn.javon.leetcode.easy._101_symmetrictree;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Javon
 * @since 2018-02-09
 **/
public class TestSymmetricTree {

    TreeNode root;

    @Before
    public void initData() {
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

        /**
         *     1
         *    / \
         *   2   2
         *   \   \
         *   3    3
         */
//        root = new TreeNode(1);
//        TreeNode left1 = new TreeNode(2);
//        TreeNode right12 = new TreeNode(3);
//        TreeNode right2 = new TreeNode(2);
//        TreeNode right22 = new TreeNode(3);
//        left1.right = right12;
//        right2.right = right22;
//        root.left = left1;
//        root.right = right2;
    }

    @Test
    public void testMySymmetricTree() {
        MySymmetricTree mySymmetricTree = new MySymmetricTree();
        System.out.println(mySymmetricTree.isSymmetric(root));
    }

    @Test
    public void testRankngSymmetricTree() {
        RankngSymmetricTree rankngSymmetricTree = new RankngSymmetricTree();
        System.out.println(rankngSymmetricTree.isSymmetric(root));
    }

}
