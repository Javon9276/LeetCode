package cn.javon.leetcode.easy._198_houserobber;

public class RankingHouseRobber1 {

    int[] dp;

    public int rob(int[] nums) {
        dp = new int[nums.length];
        java.util.Arrays.fill(dp, 0);
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            dp[i] = nums[i];
            for (int j = 0; j < i - 1; j++) {
                dp[i] = Math.max(dp[i], dp[j] + nums[i]);
            }
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }

}
