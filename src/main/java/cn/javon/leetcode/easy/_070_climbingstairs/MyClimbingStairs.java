package cn.javon.leetcode.easy._070_climbingstairs;

/**
 * @author Javon
 * @since 2018-02-05
 **/
public class MyClimbingStairs {

    public int climbStairs(int n) {
        if (n <= 1)
            return 1;

        int oneStep = 1, twoStep = 1, res = 0;

        for (int i = 2; i <= n; i++) {
            res = oneStep + twoStep;
            twoStep = oneStep;
            oneStep = res;
        }

        return res;
    }

}
