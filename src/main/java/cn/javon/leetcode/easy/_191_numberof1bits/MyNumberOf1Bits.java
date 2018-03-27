package cn.javon.leetcode.easy._191_numberof1bits;

/**
 * @author Javon
 * @since 2018-03-27
 **/
public class MyNumberOf1Bits {

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        char[] chars = Integer.toBinaryString(n).toCharArray();
        int count = 0;
        for (char c : chars){
            if (c == '1') count++;
        }
        return count;
    }

}
