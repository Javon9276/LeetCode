package cn.javon.leetcode.easy._219_containsduplicateii;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Javon
 * @since 2018-04-13
 **/
public class MyContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            } else {
                if (i - map.get(nums[i]) <= k)
                    return true;
                map.put(nums[i], i);
            }

        }
        return false;
    }

}
