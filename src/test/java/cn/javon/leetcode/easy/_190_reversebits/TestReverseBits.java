package cn.javon.leetcode.easy._190_reversebits;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-03-26
 **/
public class TestReverseBits {

    int n1 = 43261596;
    int n2 = 1;
    int n = n1;

    @Test
    public void testOfficialReverseBits1() {
        OfficialReverseBits1 officialReverseBits1 = new OfficialReverseBits1();
        System.out.println(officialReverseBits1.reverseBits(n));
    }

    @Test
    public void testOfficialReverseBits2() {
        OfficialReverseBits2 officialReverseBits2 = new OfficialReverseBits2();
        System.out.println(officialReverseBits2.reverseBits(n));
    }

    @Test
    public void testRankingReverseBits() {
        RankingReverseBits rankingReverseBits = new RankingReverseBits();
        System.out.println(rankingReverseBits.reverseBits(n));
    }

}
