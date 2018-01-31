package cn.javon.leetcode.easy._066_plusone;

/**
 * @author Javon
 * @since 2018-01-31
 **/
public class MyPlusOne {

    public int[] plusOne(int[] digits) {
        int temp = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i] + 1;
                temp--;
            }
            if (temp == 0) break;
        }
        if (digits[0] == 0) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }
        return digits;
    }

}
