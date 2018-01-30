package cn.javon.leetcode.easy._058_lengthoflastword;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-01-30
 **/
public class TestLengthOfLastWord {

//    String s = "Hello World";//5
//    String s = "a "; // 1
    String s = " "; // 0
//    String s = " a "; // 1

    @Test
    public void testMyLengthOfLastWord() {
        MyLengthOfLastWord myLengthOfLastWord = new MyLengthOfLastWord();
        System.out.println(myLengthOfLastWord.lengthOfLastWord(s));
    }

    @Test
    public void testRankingLengthOfLastWord() {
        RankingLengthOfLastWord rankingLengthOfLastWord = new RankingLengthOfLastWord();
        System.out.println(rankingLengthOfLastWord.lengthOfLastWord(s));
    }
}
