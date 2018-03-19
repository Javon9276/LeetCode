package cn.javon.leetcode.easy._172_factorialtrailingzeroes;

public class RankingFactorialTrailingZeroes {

    public int trailingZeroes(int n) {
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }

}
