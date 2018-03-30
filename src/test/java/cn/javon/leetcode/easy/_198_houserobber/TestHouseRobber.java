package cn.javon.leetcode.easy._198_houserobber;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-03-30
 **/
public class TestHouseRobber {

    int[] nums1 = new int[]{1, 1, 1, 1, 1, 1, 1};
    int[] nums2 = new int[]{1, 0, 0, 1, 0, 1, 0};
    int[] nums3 = new int[]{1, 3, 0, 1, 2, 1, 0};
    int[] nums4 = new int[]{2, 3, 2};
    int[] nums = nums3;

    @Test
    public void testRankingHouseRobber1() {
        RankingHouseRobber1 rankingHouseRobber1 = new RankingHouseRobber1();
        System.out.println(rankingHouseRobber1.rob(nums));
    }

    @Test
    public void testRankingHouseRobber2() {
        RankingHouseRobber2 rankingHouseRobber2 = new RankingHouseRobber2();
        System.out.println(rankingHouseRobber2.rob(nums));
    }

}
