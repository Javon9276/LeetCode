package cn.javon.leetcode.easy._191_numberof1bits;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-03-27
 **/
public class TestNumberOf1Bits {

    int n1 = 11;
    int n2 = 43261596;
    //    Integer n3 = 4294967295;
    int n4 = Integer.MAX_VALUE;
    int n = n4;

    @Test
    public void testMyNumberOf1Bits() {
        MyNumberOf1Bits myNumberOf1Bits = new MyNumberOf1Bits();
        System.out.println(myNumberOf1Bits.hammingWeight(n));
    }

    @Test
    public void testOfficialNumberOf1Bits1() {
        OfficialNumberOf1Bits1 officialNumberOf1Bits1 = new OfficialNumberOf1Bits1();
        System.out.println(officialNumberOf1Bits1.hammingWeight(n));
    }

    @Test
    public void testOfficialNumberOf1Bits2() {
        OfficialNumberOf1Bits2 officialNumberOf1Bits2 = new OfficialNumberOf1Bits2();
        System.out.println(officialNumberOf1Bits2.hammingWeight(n));
    }

}
