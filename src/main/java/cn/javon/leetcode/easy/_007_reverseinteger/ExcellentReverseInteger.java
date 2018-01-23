package cn.javon.leetcode.easy._007_reverseinteger;

/**
 * @author Javon
 * @since 2018-01-19
 **/
public class ExcellentReverseInteger {

    public int reverse(int x) {
        long result = 0;
        while (x != 0) {
            result = (result * 10) + (x % 10);
            if (result > Integer.MAX_VALUE) return 0;
            if (result < Integer.MIN_VALUE) return 0;
            x = x / 10;
        }
        return (int) result;
    }
}
