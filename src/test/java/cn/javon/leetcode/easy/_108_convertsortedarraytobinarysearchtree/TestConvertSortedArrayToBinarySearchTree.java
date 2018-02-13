package cn.javon.leetcode.easy._108_convertsortedarraytobinarysearchtree;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-02-13
 **/
public class TestConvertSortedArrayToBinarySearchTree {

    //    Integer[] nums = new Integer[]{0, -3, 9, -10, null, 5};
    int[] nums = new int[]{-10, -3, 0, 5, 9};

    @Test
    public void testRankingConvertSortedArrayToBinarySearchTree() {
        RankingConvertSortedArrayToBinarySearchTree rankingConvertSortedArrayToBinarySearchTree = new RankingConvertSortedArrayToBinarySearchTree();
        System.out.println(rankingConvertSortedArrayToBinarySearchTree.sortedArrayToBST(nums));
    }

}