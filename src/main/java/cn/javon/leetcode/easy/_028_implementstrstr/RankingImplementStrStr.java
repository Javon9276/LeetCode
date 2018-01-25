package cn.javon.leetcode.easy._028_implementstrstr;

public class RankingImplementStrStr {

    /**
     * 思路：
     * 看源码就能知道
     */
    public int strStr(String haystack, String needle) {
        if (haystack == null) {
            return -1;
        }
        if (haystack.length() == 0 && needle.length() == 0) {
            return 0;
        }

        if (haystack.length() == 0) {
            return -1;
        }
        if (haystack.equals(needle)) {
            return 0;
        }

        if (haystack.length() < needle.length()) {
            return -1;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        return -1;
    }

}
