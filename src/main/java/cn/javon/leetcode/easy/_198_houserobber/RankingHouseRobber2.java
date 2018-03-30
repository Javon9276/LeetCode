package cn.javon.leetcode.easy._198_houserobber;

public class RankingHouseRobber2 {

    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i <= nums.length; i++)
            dp[i] = Math.max(nums[i - 1] + dp[i - 2], dp[i - 1]);
        return dp[nums.length];
    }

}
