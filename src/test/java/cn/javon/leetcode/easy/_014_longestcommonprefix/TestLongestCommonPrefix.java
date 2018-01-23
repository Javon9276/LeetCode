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
        long startTime = System.currentTimeMillis();
        MyLongestCommonPrefix myLongestCommonPrefix = new MyLongestCommonPrefix();
        String str = myLongestCommonPrefix.longestCommonPrefix(strs);
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) + "ms");
        System.out.println(str);
    }

    @Test
    public void testExcellentLongestCommonPrefix() {
        long startTime = System.currentTimeMillis();
        ExcellentLongestCommonPrefix excellentLongestCommonPrefix = new ExcellentLongestCommonPrefix();
        String str = excellentLongestCommonPrefix.longestCommonPrefix(strs);
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) + "ms");
        System.out.println(str);
    }

    @Test
    public void testAbnormalLongestCommonPrefix() {
        long startTime = System.currentTimeMillis();
        AbnormalLongestCommonPrefix abnormalLongestCommonPrefix = new AbnormalLongestCommonPrefix();
        String str = abnormalLongestCommonPrefix.longestCommonPrefix(strs);
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) + "ms");
        System.out.println(str);
    }

}
