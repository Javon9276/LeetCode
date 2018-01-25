package cn.javon.leetcode.easy._027_removeelement;

/**
 * @author Javon
 * @since 2018-01-25
 **/
public class MyRemoveElement {

    /**
     * 思路：
     * 该题与026 Remove Duplicates from Sorted Array 的思路差距不是很大
     */
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (val != nums[j]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

}
