package cn.javon.leetcode.easy._219_containsduplicateii;

public class RankingContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;
        if (len == 0 || nums == null) {
            return false;
        }
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < len; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        long longMax = (long) max;
        long longMin = (long) min;
        if (longMax - longMin + 1 > 2 * len) {
            for (int i = 0; i < len; i++) {
                for (int j = i + 1; j < len; j++) {
                    if (nums[i] == nums[j]) {
                        if (Math.abs(i - j) <= k) {
                            return true;
                        }
                    }
                }
            }
        } else {
            int[] value = new int[max - min + 1];
            for (int i = 0; i < value.length; i++) {
                value[i] = -1;
            }
            for (int i = 0; i < len; i++) {
                int index = nums[i] - min;
                if (value[index] == -1) {
                    value[index] = i;
                } else {
                    if (Math.abs(value[index] - i) <= k) {
                        return true;
                    }
                    if (i > value[index]) {
                        value[index] = i;
                    }
                }
            }
        }
        return false;
    }

}
