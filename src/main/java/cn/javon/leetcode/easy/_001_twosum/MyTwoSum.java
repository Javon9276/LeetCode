package cn.javon.leetcode.easy._001_twosum;

/**
 * @author Javon
 * @since 2018-01-19
 **/
public class MyTwoSum {

    int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
