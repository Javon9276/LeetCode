package cn.javon.leetcode.easy._189_rotatearray;

public class RankingRotateArray {

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        if (k == 0) return;
        int[] tmp = new int[k];
        System.arraycopy(nums, len-k, tmp, 0, k);
        System.arraycopy(nums, 0, nums, k, len-k);
        System.arraycopy(tmp, 0, nums, 0, k);
    }

}
