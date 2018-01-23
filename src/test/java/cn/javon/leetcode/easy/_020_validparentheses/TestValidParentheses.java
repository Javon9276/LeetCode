package cn.javon.leetcode.easy._020_validparentheses;

import org.junit.*;

/**
 * @author Javon
 * @since 2018-01-23
 **/
public class TestValidParentheses {

    String s1 = "";
    String s2 = "(123123)";
    String s3 = "(asda[sdsd])";
    String s4 = "(asda[sd)sd]";
    String s5 = "(asdasd)[sd]";

    String s = s3;

    @Test
    public void testMyValidParentheses() {
        MyValidParentheses myValidParentheses = new MyValidParentheses();
        System.out.println(myValidParentheses.isValid(s));
    }

    @Test
    public void testAbnormalValidParentheses() {
        AbnormalValidParentheses abnormalValidParentheses = new AbnormalValidParentheses();
        System.out.println(abnormalValidParentheses.isValid(s));
    }

}
