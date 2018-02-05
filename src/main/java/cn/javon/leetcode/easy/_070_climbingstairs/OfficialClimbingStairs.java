package cn.javon.leetcode.easy._070_climbingstairs;

/**
 * @author Javon
 * @since 2018-02-05
 **/
public class OfficialClimbingStairs {

    /**
     * 暴力破解
     * Brute Force
     */
    public int bf_ClimbStairs(int n) {
        return bf_climb_Stairs(0, n);
    }
    private int bf_climb_Stairs(int i, int n) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        return bf_climb_Stairs(i + 1, n) + bf_climb_Stairs(i + 2, n);
    }


    /**
     * 记忆递归
     * Recursion with memorization
     */
    public int rwm_climbStairs(int n) {
        int memo[] = new int[n + 1];
        return rwm_climb_Stairs(0, n, memo);
    }
    private int rwm_climb_Stairs(int i, int n, int memo[]) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        if (memo[i] > 0) {
            return memo[i];
        }
        memo[i] = rwm_climb_Stairs(i + 1, n, memo) + rwm_climb_Stairs(i + 2, n, memo);
        return memo[i];
    }

    /**
     * 动态规划
     * Dynamic Programming
     */
    public int dp_climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    /**
     * 斐波那契数
     * Fibonacci Number
     */
    public int fn_climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }

    /**
     * Binets Method
     */
    public int bm_climbStairs(int n) {
        int[][] q = {{1, 1}, {1, 0}};
        int[][] res = bm_pow(q, n);
        return res[0][0];
    }
    private int[][] bm_pow(int[][] a, int n) {
        int[][] ret = {{1, 0}, {0, 1}};
        while (n > 0) {
            if ((n & 1) == 1) {
                ret = bm_multiply(ret, a);
            }
            n >>= 1;
            a = bm_multiply(a, a);
        }
        return ret;
    }
    private int[][] bm_multiply(int[][] a, int[][] b) {
        int[][] c = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j];
            }
        }
        return c;
    }


    /**
     *  Fibonacci Formula
     */
    public int ff_climbStairs(int n) {
        double sqrt5=Math.sqrt(5);
        double fibn=Math.pow((1+sqrt5)/2,n+1)-Math.pow((1-sqrt5)/2,n+1);
        return (int)(fibn/sqrt5);
    }
}
