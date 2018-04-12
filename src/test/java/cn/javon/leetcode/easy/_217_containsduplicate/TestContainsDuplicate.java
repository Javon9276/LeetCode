package cn.javon.leetcode.easy._217_containsduplicate;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-04-12
 **/
public class TestContainsDuplicate {

    int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 4};

    @Test
    public void testMyContainsDuplicate() {
        MyContainsDuplicate myContainsDuplicate = new MyContainsDuplicate();
        System.out.println(myContainsDuplicate.containsDuplicate(nums));
    }

    @Test
    public void testRankingContainsDuplicate(){
        RankingContainsDuplicate rankingContainsDuplicate=  new RankingContainsDuplicate();
        System.out.println(rankingContainsDuplicate.containsDuplicate(nums));
    }

}
