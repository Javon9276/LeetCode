package cn.javon.leetcode.easy._053_maximumsubarray;

/**
 * @author Javon
 * @since 2018-01-29
 **/
public class RankingMaximumSubarray {

    /**
     * 只循环一次
     */
    public int maxSubArray(int[] nums) {
        int max = nums[0];// 最大值
        int total = nums[0];// 区间数组和
        for (int i = 1; i < nums.length; i++) {
            // 如果当前值大于区间数组与当前值的和
            if (nums[i] > total + nums[i]) {
                // 区间数组和等于该值
                total = nums[i];
            } else {
                // 区间数组和 = 区间数组和 + 当前值
                total = total + nums[i];
            }
            if (total > max) {
                max = total;
            }
        }
        return max;
    }

    public int maxSubArray2(int[] nums) {
        int maxEndingHere = 0, maxSoFar = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            maxEndingHere += nums[i];
            if (maxEndingHere > maxSoFar) maxSoFar = maxEndingHere;
            if (maxEndingHere < 0) maxEndingHere = 0;
        }
        return maxSoFar;
    }
}
