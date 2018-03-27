package cn.javon.leetcode.easy._191_numberof1bits;

public class OfficialNumberOf1Bits2 {

    public int hammingWeight(int n) {
        int sum = 0;
        while (n != 0) {
            sum++;
            n &= (n - 1);
        }
        return sum;
    }

}
