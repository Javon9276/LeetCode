package cn.javon.leetcode.easy._038_countandsay;

/**
 * @author Javon
 * @since 2018-01-29
 **/
public class MyCountAndSay {

    /**
     * 思路：
     * 题目的要求是数数字的个数：
     * 例如：111221，3个1，2个2，1个1，结果就是312211
     * 题目是从1开始，数到提供的数字n为止。
     */
    public String countAndSay(int n) {
        if (n < 1) return "";
        String result = "1";
        for (int i = 1; i < n; i++) {
            result = convert(result);
        }
        return result;
    }

    public String convert(String str) {
        char[] chars = str.toCharArray();
        int index = 1;
        String temp = "";
        for (int j = 1; j < chars.length; j++) {
            if (chars[j] == chars[j - 1]) {
                index++;
            } else {
                temp = temp + index + chars[j - 1];
                index = 1;
            }
        }
        return temp + index + chars[chars.length - 1];
    }

}
