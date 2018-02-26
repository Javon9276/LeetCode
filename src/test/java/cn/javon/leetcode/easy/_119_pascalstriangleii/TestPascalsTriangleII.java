package cn.javon.leetcode.easy._119_pascalstriangleii;

import org.junit.Test;

import java.util.List;

/**
 * @author Javon
 * @since 2018-02-26
 **/
public class TestPascalsTriangleII {

    int numRows = 3;

    @Test
    public void testMyPascalsTriangleII() {
        MyPascalsTriangleII myPascalsTriangleII = new MyPascalsTriangleII();
        List<Integer> list = myPascalsTriangleII.getRow(numRows);
        System.out.println(list);
    }

    @Test
    public void testRankingPascalsTriangleII() {
        RankingPascalsTriangleII rankingPascalsTriangleII = new RankingPascalsTriangleII();
        List<Integer> list = rankingPascalsTriangleII.getRow(numRows);
        System.out.println(list);
    }
}
