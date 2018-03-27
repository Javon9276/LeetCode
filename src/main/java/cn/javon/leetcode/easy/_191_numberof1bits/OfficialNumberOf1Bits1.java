package cn.javon.leetcode.easy._191_numberof1bits;

public class OfficialNumberOf1Bits1 {

    public int hammingWeight(int n) {
        int bits = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                bits++;
            }
            mask <<= 1;
        }
        return bits;
    }

}
