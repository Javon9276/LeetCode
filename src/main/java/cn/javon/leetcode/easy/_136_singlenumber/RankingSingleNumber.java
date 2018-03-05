package cn.javon.leetcode.easy._136_singlenumber;

public class RankingSingleNumber {

    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Integer.MIN_VALUE;
        }
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }

}
