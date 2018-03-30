# 198. House Robber
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.

# 198. 打家劫舍
你是一个专业的强盗，计划抢劫沿街的房屋。每间房都藏有一定的现金，阻止你抢劫他们的唯一的制约因素就是相邻的房屋有保安系统连接，如果两间相邻的房屋在同一晚上被闯入，它会自动联系警方。

给定一个代表每个房屋的金额的非负整数列表，确定你可以在没有提醒警方的情况下抢劫的最高金额。

# Ranking2思路
定义一个数组，把所有(i-1)和(i-2) + nums[i-1]的值进行比较，最后取大的结果进行存放到数组中，再继续对比下一组数据。
```
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
```