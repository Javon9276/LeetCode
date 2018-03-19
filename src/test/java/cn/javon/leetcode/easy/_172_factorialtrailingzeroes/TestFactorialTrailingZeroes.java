package cn.javon.leetcode.easy._172_factorialtrailingzeroes;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-03-16
 **/
public class TestFactorialTrailingZeroes {

    int n1 = 10;
    int n2 = 1808548329;

    int n = n1;

    @Test
    public void testMyFactorialTrailingZeroes() {
        MyFactorialTrailingZeroes myFactorialTrailingZeroes = new MyFactorialTrailingZeroes();
        System.out.println(myFactorialTrailingZeroes.trailingZeroes(n));
    }

}
