package cn.javon.leetcode.easy._035_searchinsertposition;

public class MySearchInsertPosition {

    /**
     * 思路：
     * 循环所有数组查出大于等于目标值的则输出下标
     */
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int i = 0;
        for (; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return i;
    }

}
