package cn.javon.leetcode.easy._053_maximumsubarray;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-01-29
 **/
public class TestMaximumSubarray {


    private int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
//    private int[] nums = new int[]{1,2};
//    private int[] nums = new int[]{1};
//    private int[] nums = new int[]{-2,1};

    @Test
    public void testMyMaximumSubarray() {
        MyMaximumSubarray myMaximumSubarray = new MyMaximumSubarray();
        System.out.println(myMaximumSubarray.maxSubArray(nums));
    }

    @Test
    public void testRankingMaximumSubarray() {
        RankingMaximumSubarray rankingMaximumSubarray = new RankingMaximumSubarray();
        System.out.println(rankingMaximumSubarray.maxSubArray(nums));
    }
}
