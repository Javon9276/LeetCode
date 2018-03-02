package cn.javon.leetcode.easy._125_validpalindrome;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-03-02
 **/
public class TestValidPalindrome {

    String s1 = "A man, a plan, a canal: Panama";
    String s2 = "race a car";
    String s3 = ".,";
    String s = s3;

    @Test
    public void testMyValidPalindrome() {
        MyValidPalindrome myValidPalindrome = new MyValidPalindrome();
        System.out.println(myValidPalindrome.isPalindrome(s));
    }

    @Test
    public void testRankingValidPalindrome() {
        RankingValidPalindrome rankingValidPalindrome = new RankingValidPalindrome();
        System.out.println(rankingValidPalindrome.isPalindrome(s));
    }

}
