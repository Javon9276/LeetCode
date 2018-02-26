package cn.javon.leetcode.easy._119_pascalstriangleii;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Javon
 * @since 2018-02-26
 **/
public class MyPascalsTriangleII {

    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> lists = new LinkedList<List<Integer>>();
        for (int i = 1; i <= rowIndex + 1; i++) {
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
        return lists.get(rowIndex);
    }

}
