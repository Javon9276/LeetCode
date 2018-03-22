package cn.javon.leetcode.easy._009_palindromenumber;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-01-19
 **/
public class TestPalindromeNumber {

    private int num1 = 12321;
    private int num2 = -123321;
    private int num3 = 120;
    private int num4 = 1534236469;
    private int num5 = -2147483648;
    private int num6 = -2147447412;
    private int num = num1;

    @Test
    public void testMyPalindromeNumber() {
        MyPalindromeNumber myReverseInteger = new MyPalindromeNumber();
        System.out.println(myReverseInteger.isPalindrome(num));
    }

    @Test
    public void testOfficialPalindromeNumber() {
        OfficialPalindromeNumber officialPalindromeNumber = new OfficialPalindromeNumber();
        System.out.println(officialPalindromeNumber.isPalindrome(num));
    }
    @Test
    public void testRankingPalindromeNumber() {
        RankingPalindromeNumber rankingPalindromeNumber = new RankingPalindromeNumber();
        System.out.println(rankingPalindromeNumber.isPalindrome(num));
    }
}
