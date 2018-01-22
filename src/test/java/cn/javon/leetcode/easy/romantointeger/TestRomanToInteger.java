package cn.javon.leetcode.easy.romantointeger;

import org.junit.Test;

public class TestRomanToInteger {

//    private String data = "MCMXCVI";
//    private String data = "IXIII";
//    private String data = "IXIIIIX";
    private String data = "XXI";

    @Test
    public void testMyRomanToInteger(){
        MyRomanToInteger myRomanToInteger = new MyRomanToInteger();
        System.out.println(myRomanToInteger.romanToInt(data));
    }

    @Test
    public void testAbnormalRomanToInteger(){
        AbnormalRomanToInteger abnormalRomanToInteger = new AbnormalRomanToInteger();
        System.out.println(abnormalRomanToInteger.romanToInt(data));
    }
}
