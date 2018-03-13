package cn.javon.leetcode.easy._169_majorityelement;

import java.util.Arrays;

public class OfficialMajorityElement {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

}
