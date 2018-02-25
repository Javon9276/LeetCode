package cn.javon.leetcode.easy._118_pascalstriangle;

import java.util.LinkedList;
import java.util.List;

public class MyPascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new LinkedList<List<Integer>>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> list = new LinkedList<Integer>();
            if (i == 1) {
                list.add(1);
            } else if (i == 2) {
                list.add(1);
                list.add(1);
            } else {
                for (int j = 0; j < i; j++) {
                    if (j == 0 || j == (i - 1)) {
                        list.add(1);
                    } else {
                        List<Integer> row = lists.get(i - 2);
                        list.add(row.get(j) + row.get(j - 1));
                    }
                }
            }
            lists.add(list);

        }
        return lists;
    }

}
