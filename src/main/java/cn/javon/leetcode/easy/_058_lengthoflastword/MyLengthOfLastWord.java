package cn.javon.leetcode.easy._058_lengthoflastword;

/**
 * @author Javon
 * @since 2018-01-30
 **/
public class MyLengthOfLastWord {

    /**
     * 思路：
     * 其实没有什么思路，主要感觉是问题描述有点不清楚，多试几遍就能成功
     */
    public int lengthOfLastWord(String s) {
        s = s.trim();
        if ("".equals(s)) return 0;
        return s.length() - s.lastIndexOf(" ") - 1;
    }

}
