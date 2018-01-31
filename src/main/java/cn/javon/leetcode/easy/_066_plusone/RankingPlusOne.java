package cn.javon.leetcode.easy._066_plusone;

public class RankingPlusOne {

    /**
     * 思路：
     * 1. 当digits[i]的值少于9的时候，加一后就直接返回
     * 2. 等于9则直接赋值为0
     * 3.如果整个数组所有值都为9则返回新数组
     */
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
