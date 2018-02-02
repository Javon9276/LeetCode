package cn.javon.leetcode.easy._069_sqrt_x;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-02-02
 **/
public class TestSqrtX {

    // 2
    int x1 = 4;

    // 2
    int x2 = 8;

    // 9
    int x3 = 81;

    // 9
    int x4 = 82;

    // 8
    int x5 = 80;

    // 6
    int x6 = 36;

    // 255
    int x7 = 65535;

    int x = x4;


    @Test
    public void testSystem() {
        MySqrtX mySqrtX = new MySqrtX();
        System.out.println(mySqrtX.systemSqrtX(x));
    }

    @Test
    public void testMySqrtX() {
        MySqrtX mySqrtX = new MySqrtX();
        System.out.println(mySqrtX.mySqrt(x));
    }

    @Test
    public void testRankingSqrtX() {
        RankingSqrtX rankingSqrtX = new RankingSqrtX();
        System.out.println(rankingSqrtX.mySqrt(x));
    }

}
