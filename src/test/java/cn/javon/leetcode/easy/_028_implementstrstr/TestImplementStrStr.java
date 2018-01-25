package cn.javon.leetcode.easy._028_implementstrstr;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-01-25
 **/
public class TestImplementStrStr {


    String haystack1 = "hello";
    String needle1 = "ll";

    String haystack2 = "aaaaa";
    String needle2 = "bba";

    String haystack = haystack1;
    String needle = needle1;

    @Test
    public void testMyImplementStrStr() {
        MyImplementStrStr myImplementStrStr = new MyImplementStrStr();
        System.out.println(myImplementStrStr.strStr(haystack, needle));
    }

    @Test
    public void testRankingImplementStrStr() {
        RankingImplementStrStr rankingImplementStrStr = new RankingImplementStrStr();
        System.out.println(rankingImplementStrStr.strStr(haystack, needle));
    }

}
