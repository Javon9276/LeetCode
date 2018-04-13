package cn.javon.leetcode.easy._219_containsduplicateii;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-04-13
 **/
public class TestContainsDuplicateII {

    int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 4};

    int k = 0;

    @Test
    public void testMyContainsDuplicateII() {
        MyContainsDuplicateII myContainsDuplicateII = new MyContainsDuplicateII();
        System.out.println(myContainsDuplicateII.containsNearbyDuplicate(nums, k));
    }

    @Test
    public void testRankingContainsDuplicateII() {
        RankingContainsDuplicateII rankingContainsDuplicateII = new RankingContainsDuplicateII();
        System.out.println(rankingContainsDuplicateII.containsNearbyDuplicate(nums, k));
    }
}
