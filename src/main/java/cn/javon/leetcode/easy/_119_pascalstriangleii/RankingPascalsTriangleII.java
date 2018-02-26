package cn.javon.leetcode.easy._119_pascalstriangleii;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Javon
 * @since 2018-02-26
 **/
public class RankingPascalsTriangleII {

    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> row = new ArrayList<Integer>();
        long last = 1;
        row.add((int)last);
        for (int i=1; i<= rowIndex; i++) {
            last = last * (long)(rowIndex + 1 - i)/i;
            row.add((int)last);
        }
        return row;
    }

}
