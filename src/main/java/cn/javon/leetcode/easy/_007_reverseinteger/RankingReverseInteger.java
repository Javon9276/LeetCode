package cn.javon.leetcode.easy._007_reverseinteger;

class RankingReverseInteger {

    public int reverse(int x) {
        int output = 0;
        while (true) {
            if (x == 0) {
                return x;
            }
            output = output * 10 + x % 10;
            if ((x /= 10) == 0) {
                return output;
            }
            if (output > 214748364 || output < -214748364) {
                return 0;
            }
        }
    }

}
