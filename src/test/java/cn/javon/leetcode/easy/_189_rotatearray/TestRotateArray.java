package cn.javon.leetcode.easy._189_rotatearray;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-03-23
 **/
public class TestRotateArray {

    int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
    int n = 3;

    @Test
    public void testOfficialRotateArray() {
        OfficialRotateArray officialRotateArray = new OfficialRotateArray();
        officialRotateArray.rotate(nums, n);
    }

    @Test
    public void testRankingRotateArray() {
        RankingRotateArray rankingRotateArray = new RankingRotateArray();
        rankingRotateArray.rotate(nums, n);
    }

}
