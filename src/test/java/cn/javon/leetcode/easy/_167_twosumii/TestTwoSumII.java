package cn.javon.leetcode.easy._167_twosumii;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-03-08
 **/
public class TestTwoSumII {

    int[] numbers = new int[]{2, 7, 11, 15};
    int targer = 9;

    @Test
    public void testMyTwoSumII() {
        MyTwoSumII myTwoSumII = new MyTwoSumII();
        int[] result = myTwoSumII.twoSum(numbers, targer);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    @Test
    public void testRankingTwoSumII1() {
        RankingTwoSumII1 rankingTwoSumII1 = new RankingTwoSumII1();
        int[] result = rankingTwoSumII1.twoSum(numbers, targer);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    @Test
    public void testRankingTwoSumII2() {
        RankingTwoSumII2 rankingTwoSumII2 = new RankingTwoSumII2();
        int[] result = rankingTwoSumII2.twoSum(numbers, targer);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

}
