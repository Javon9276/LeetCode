package cn.javon.leetcode.easy._053_maximumsubarray;

/**
 * @author Javon
 * @since 2018-01-29
 **/
public class MyMaximumSubarray {

    /**
     * 超级暴力破解，LeetCode纠结了
     * 循环两次，时间空间复杂度很高。
     */
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int total = nums[i];
            // 如果单是最大，则赋值最大
            if (total > max) {
                max = total;
            }
            for (int j = i + 1; j < nums.length; j++) {
                total += nums[j];
                // 区间数组相加最大，则赋值最大
                if (total > max) {
                    max = total;
                }
            }
        }
        return max;
    }

}
