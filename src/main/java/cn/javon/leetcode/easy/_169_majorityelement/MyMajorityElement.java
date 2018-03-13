package cn.javon.leetcode.easy._169_majorityelement;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Javon
 * @since 2018-03-13
 **/
public class MyMajorityElement {

    public int majorityElement(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i]) + 1);
            else
                map.put(nums[i], 1);
        }
        if (map.size() == nums.length) return 0;
        int max = nums[0];
        for (Integer i : map.keySet()) {
            if (map.get(max) < map.get(i))
                max = i;
        }
        return max;
    }

}
