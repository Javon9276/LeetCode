package cn.javon.leetcode.easy._026_removeduplicatesfromsortedarray;

public class MyRemoveDuplicatesfromSortedArray {

    /**
     * 思路：
     * 1. 记住与前面相同的数据
     * 2. 如果相同，则记住一个位置
     * 3. 如果不同，则替换位置。
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1)
            return nums.length;
        int length = 0;
        int num = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (num != nums[i]) {
                num = nums[i];
                nums[i - length] = nums[i];
            } else {
                length++;
            }
        }
        return nums.length - length;
    }

}
