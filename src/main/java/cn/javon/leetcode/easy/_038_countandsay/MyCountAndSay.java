package cn.javon.leetcode.easy._038_countandsay;

/**
 * @author Javon
 * @since 2018-01-29
 **/
public class MyCountAndSay {

    /**
     * ˼·��
     * ��Ŀ��Ҫ���������ֵĸ�����
     * ���磺111221��3��1��2��2��1��1���������312211
     * ��Ŀ�Ǵ�1��ʼ�������ṩ������nΪֹ��
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
