package cn.javon.leetcode.easy.twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Javon
 * @since 2018-01-19
 **/
public class ExcellentTwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
