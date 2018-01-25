package cn.javon.leetcode.easy._014_longestcommonprefix;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-01-22
 **/
public class TestLongestCommonPrefix {

    String[] strs0 = new String[]{};
    String[] strs1 = new String[]{""};
    String[] strs2 = new String[]{"", "b"};
    String[] strs3 = new String[]{"a", "b", "c"};
    String[] strs4 = new String[]{"a", "ab", "ac"};
    String[] strs5 = new String[]{"bcda", "bcdb", "bccccc"};
    String[] strs6 = new String[]{"aa", "a"};

    String[] strs = strs5;

    @Test
    public void testMyLongestCommonPrefix() {
        MyLongestCommonPrefix myLongestCommonPrefix = new MyLongestCommonPrefix();
        System.out.println(myLongestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    public void testOfficialLongestCommonPrefix() {
        OfficialLongestCommonPrefix officialLongestCommonPrefix = new OfficialLongestCommonPrefix();
        System.out.println(officialLongestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    public void testRankingLongestCommonPrefix() {
        RankingLongestCommonPrefix rankingLongestCommonPrefix = new RankingLongestCommonPrefix();
        System.out.println(rankingLongestCommonPrefix.longestCommonPrefix(strs));
    }

}
