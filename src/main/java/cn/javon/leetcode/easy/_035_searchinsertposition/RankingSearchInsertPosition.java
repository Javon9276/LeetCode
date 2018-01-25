package cn.javon.leetcode.easy._035_searchinsertposition;

public class RankingSearchInsertPosition {

    /**
     * 思路：
     * 使用二分法进行查找
     */
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else
                return mid;
        }

        return start;
    }

}
