package cn.javon.leetcode.easy._013_romantointeger;

public class RankingRomanToInteger {

    /**
     * 思路：
     * 3. 小的数字（限于 I、X 和 C）在大的数字的左边、所表示的数等于大数减小数得到的数、如：Ⅳ=4、Ⅸ=9；
     *    1. V 和 X 左边的小数字只能用I。
     *    2. L 和 C 左边的小数字只能用X。
     *    3. D 和 M 左边的小数字只能用C 。
     * 列出这个逻辑组合是 IV,IX,XL,XC,CD,CM
     * 因此全部结合
     */
    public int romanToInt(String s) {
        int result = 0;
        if (s.indexOf("IV") > -1) {
            result -= 2;
        }
        if (s.indexOf("IX") > -1) {
            result -= 2;
        }
        if (s.indexOf("XL") > -1) {
            result -= 20;
        }
        if (s.indexOf("XC") > -1) {
            result -= 20;
        }
        if (s.indexOf("CD") > -1) {
            result -= 200;
        }
        if (s.indexOf("CM") > -1) {
            result -= 200;
        }

        char[] Arr = s.toCharArray();

        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] == 'M') result += 1000;
            if (Arr[i] == 'D') result += 500;
            if (Arr[i] == 'C') result += 100;
            if (Arr[i] == 'L') result += 50;
            if (Arr[i] == 'X') result += 10;
            if (Arr[i] == 'V') result += 5;
            if (Arr[i] == 'I') result += 1;
        }
        return result;
    }

}
