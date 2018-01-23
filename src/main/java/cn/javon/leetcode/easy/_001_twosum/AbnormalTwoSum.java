package cn.javon.leetcode.easy._001_twosum;

/**
 * @author Javon
 * @since 2018-01-19
 **/
public class AbnormalTwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] map = new int[20050];
        int size = 4;
        for (int i = 0; i < nums.length; i++) {
            map[nums[i] + size] = (i + 1);
            int diff = target - nums[i + 1] + size;
            if (diff < 0) continue;
            int d = map[diff];
            if (d > 0)
                return new int[]{d - 1, i + 1};
        }
        return null;
    }

}
