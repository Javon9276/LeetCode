package cn.javon.leetcode.easy._028_implementstrstr;

/**
 * @author Javon
 * @since 2018-01-25
 **/
public class MyImplementStrStr {

    /**
     * 思路：
     * 直接使用Java的内置方法，当然题目不是让你直接使用，而是想你实现indexOf功能
     */
//    public int strStr(String haystack, String needle) {
//        return haystack.indexOf(needle);
//    }

    /**
     * Java indexOf 源码更改
     */
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;
        char first = needle.charAt(0);
        int max = haystack.length() - needle.length();
        for (int i = 0; i <= max; i++) {
            if (haystack.charAt(i) != first) {
                while (++i <= max && haystack.charAt(i) != first) ;
            }
            if (i <= max) {
                int j = i + 1;
                int end = j + needle.length() - 1;
                for (int k = 1; j < end && haystack.charAt(j) == needle.charAt(k); j++, k++);
                if (j == end) {
                    return i;
                }
            }
        }
        return -1;
    }

}
