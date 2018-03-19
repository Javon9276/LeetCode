package cn.javon.leetcode.easy._172_factorialtrailingzeroes;

/**
 * @author Javon
 * @since 2018-03-16
 **/
public class MyFactorialTrailingZeroes {

    public int trailingZeroes(int n) {
        int i = 0;
        while (n / 5 != 0) {
            n /= 5;
            i += n;
        }
        return i;
    }
}
