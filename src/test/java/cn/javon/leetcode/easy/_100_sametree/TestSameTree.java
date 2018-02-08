package cn.javon.leetcode.easy._100_sametree;

import org.junit.Before;
import org.junit.Test;

public class TestSameTree {


    TreeNode p;
    TreeNode q;

    @Before
    public void initData() {
        p = new TreeNode(1);
        TreeNode treeNode11 = new TreeNode(2);
        TreeNode treeNode12 = new TreeNode(3);
        p.left = treeNode11;
        p.right = treeNode12;
        q = new TreeNode(1);
        TreeNode treeNode21 = new TreeNode(2);
        TreeNode treeNode22 = new TreeNode(3);
        q.left = treeNode21;
        q.right = treeNode22;
//        q = new TreeNode(0);
    }


    @Test
    public void testMySameTree() {
        MySameTree mySameTree = new MySameTree();
        System.out.println(mySameTree.isSameTree(p, q));
    }

    @Test
    public void testRankingSameTree() {
        RankingSameTree rankingSameTree = new RankingSameTree();
        System.out.println(rankingSameTree.isSameTree(p, q));
    }

}
