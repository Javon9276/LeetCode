package cn.javon.leetcode.easy.romantointeger;

import org.junit.Test;

public class TestRomanToInteger {

//    private String data = "MCMXCVI";
    private String data = "IXIII";

    @Test
    public void testMyRomanToInteger(){
        MyRomanToInteger myRomanToInteger = new MyRomanToInteger();
        System.out.println(myRomanToInteger.romanToInt(data));
    }

}
