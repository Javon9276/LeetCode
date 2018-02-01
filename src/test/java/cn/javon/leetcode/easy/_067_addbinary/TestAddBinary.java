package cn.javon.leetcode.easy._067_addbinary;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-02-01
 **/
public class TestAddBinary {

    // 100
    private String a1 = "11";
    private String b1 = "1";

    private String a2 = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
    private String b2 = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

    // 0
    private String a3 = "0";
    private String b3 = "0";

    // 10
    private String a4 = "1";
    private String b4 = "1";

    // 10101
    private String a5 = "1010";
    private String b5 = "1011";

    // 11110
    private String a6 = "1111";
    private String b6 = "1111";

    private String a = a1;
    private String b = b1;

    @Test
    public void testMyAddBinary() {
        MyAddBinary myAddBinary = new MyAddBinary();
        System.out.println(myAddBinary.addBinary(a, b));
    }

    @Test
    public void testRankingAddBinary() {
        RankingAddBinary rankingAddBinary = new RankingAddBinary();
        System.out.println(rankingAddBinary.addBinary(a, b));
    }

}
