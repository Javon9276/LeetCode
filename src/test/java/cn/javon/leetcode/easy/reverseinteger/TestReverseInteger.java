package cn.javon.leetcode.easy.reverseinteger;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-01-19
 **/
public class TestReverseInteger {

    private int num1 = 123;
    private int num2 = -123;
    private int num3 = 120;
    private int num4 = 1534236469;
    private int num5 = -2147483648;
    private int num = num1;

    @Test
    public void testMyReverseInteger() {
        MyReverseInteger myReverseInteger = new MyReverseInteger();
        System.out.println(num);
        System.out.println(myReverseInteger.reverse(num));
    }
}
