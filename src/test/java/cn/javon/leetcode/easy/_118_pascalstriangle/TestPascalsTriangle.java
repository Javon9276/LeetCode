package cn.javon.leetcode.easy._118_pascalstriangle;

import org.junit.Test;

import java.util.List;

public class TestPascalsTriangle {

    int numRows = 5;

    @Test
    public void testMyPascalsTriangle() {
        MyPascalsTriangle myPascalsTriangle = new MyPascalsTriangle();
        List<List<Integer>> lists = myPascalsTriangle.generate(numRows);
        for (int i = 0; i < lists.size(); i++) {
            List<Integer> list = lists.get(i);
            System.out.println(list);
        }
    }

    @Test
    public void testRankingPascalsTriangle() {
        RankingPascalsTriangle rankingPascalsTriangle = new RankingPascalsTriangle();
        List<List<Integer>> lists = rankingPascalsTriangle.generate(numRows);
        for (int i = 0; i < lists.size(); i++) {
            List<Integer> list = lists.get(i);
            System.out.println(list);
        }
    }

}
