package cn.javon.leetcode.easy._136_singlenumber;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-03-05
 **/
public class TestSingleNumber {

    int[] nums1 = new int[]{4, 5, 4};
    int[] nums2 = new int[]{-1};

    int[] nums = nums2;

    @Test
    public void testMySingleNumber() {
        MySingleNumber mySingleNumber = new MySingleNumber();
        System.out.println(mySingleNumber.singleNumber(nums));
    }

    @Test
    public void testRankingSingleNumber() {
        RankingSingleNumber rankingSingleNumber = new RankingSingleNumber();
        System.out.println(rankingSingleNumber.singleNumber(nums));
    }
}
