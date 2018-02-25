package cn.javon.leetcode.easy._118_pascalstriangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RankingPascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        int[][] lists = new int[numRows][];
        int[] pre = null;
        for (int i = 0; i < numRows; i++) {
            int[] list = new int[i + 1];
            list[0] = 1;
            if (pre == null) {
                lists[i] = list;
                pre = list;
                continue;
            }
            for (int i1 = 1; i1 <= i; i1++) {
                int size = pre.length;

                if (i1 + 1 <= size) {
                    list[i1] = pre[i1] + pre[i1 - 1];
                } else {
                    list[i1] = 1;
                }
            }
            lists[i] = list;
            pre = list;

        }
        return (List) Arrays.asList(lists);
    }

//    public List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> rows = new ArrayList<List<Integer>>();
//        ArrayList<Integer> row = new ArrayList<Integer>();
//        if (numRows == 0) return rows;
//        row.add(1);
//        rows.add(row);
//        for (int i=1; i<numRows; i++) {
//            row = new ArrayList<Integer>();
//            row.add(1);
//            for (int j=1; j<i; j++) {
//                row.add(rows.get(i-1).get(j-1)+rows.get(i-1).get(j));
//            }
//            row.add(1);
//            rows.add(row);
//        }
//        return rows;
//    }

}
