package cn.javon.leetcode.easy._035_searchinsertposition;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-01-25
 **/
public class TestSearchInsertPosition {

    int targer1 = 5;
    int targer2 = 2;
    int targer3 = 7;
    int targer4 = 0;

    int[] nums = new int[]{1, 3, 5, 6};
    int targer = targer3;

    @Test
    public void testMySearchInsertPosition() {
        MySearchInsertPosition mySearchInsertPosition = new MySearchInsertPosition();
        System.out.println(mySearchInsertPosition.searchInsert(nums, targer));
    }

    @Test
    public void testRankingSearchInsertPosition() {
        RankingSearchInsertPosition rankingSearchInsertPosition = new RankingSearchInsertPosition();
        System.out.println(rankingSearchInsertPosition.searchInsert(nums, targer));
    }

}
