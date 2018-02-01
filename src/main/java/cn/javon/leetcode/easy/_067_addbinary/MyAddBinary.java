package cn.javon.leetcode.easy._067_addbinary;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Javon
 * @since 2018-02-01
 **/
public class MyAddBinary {


    /**
     * 思路：
     * 用最长字符串作为数组长度，切割两个字符串到数组中
     * 例如：11，1   切割成   [1,1]，[0,1]
     * 使用next进行记录，如果要进一位则next=1，否则next=0
     * next = 0 相加有三种情况：
     * 1. 两者都是0，结果为0
     * 2. 一个1，一个0，结果为1
     * 3. 两者都是1，结果为0，进一位
     * next = 1 相加有三种情况：
     * 1. 两者都是0，结果为1
     * 2. 一个1，一个0，结果为0，进一位
     * 3. 两者都是1，结果为1，进一位
     * 如果最后得到结果时，next为1，则需要再进一位。
     *
     * 总结：
     * 应该多使用废弃资源循环利用
     */
    public String addBinary(String a, String b) {
        int length = a.length() > b.length() ? a.length() : b.length();
        int[] aArray = new int[length];
        for (int i = 0; i < a.length(); i++) {
            aArray[length - a.length() + i] = Integer.parseInt(String.valueOf(a.charAt(i)));
        }
        int[] bArray = new int[length];
        for (int i = 0; i < b.length(); i++) {
            bArray[length - b.length() + i] = Integer.parseInt(String.valueOf(b.charAt(i)));
        }

        List<Integer> list = new ArrayList<Integer>();
        int next = 0;
        for (int i = length - 1; i >= 0; i--) {
            int result = aArray[i] + bArray[i] + next;
            list.add(result % 2);
            next = result / 2;
        }
        if (next == 1) list.add(1);
        StringBuilder sb = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append(list.get(i));
        }
        return sb.toString();
    }

}
