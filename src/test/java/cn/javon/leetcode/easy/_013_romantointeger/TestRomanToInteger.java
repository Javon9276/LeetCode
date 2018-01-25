package cn.javon.leetcode.easy._013_romantointeger;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-01-20
 **/
public class TestRomanToInteger {

    //    private String data = "MCMXCVI";
//    private String data = "IXIII";
//    private String data = "IXIIIIX";
    private String data = "XXI";

    @Test
    public void testMyRomanToInteger() {
        MyRomanToInteger myRomanToInteger = new MyRomanToInteger();
        System.out.println(myRomanToInteger.romanToInt(data));
    }

    @Test
    public void testRankingRomanToInteger() {
        RankingRomanToInteger rankingRomanToInteger = new RankingRomanToInteger();
        System.out.println(rankingRomanToInteger.romanToInt(data));
    }
}
