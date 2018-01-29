package cn.javon.leetcode.easy._053_maximumsubarray;

/**
 * @author Javon
 * @since 2018-01-29
 **/
public class MyMaximumSubarray {

    /**
     * ���������ƽ⣬LeetCode������
     * ѭ�����Σ�ʱ��ռ临�ӶȺܸߡ�
     */
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int total = nums[i];
            // ������������ֵ���
            if (total > max) {
                max = total;
            }
            for (int j = i + 1; j < nums.length; j++) {
                total += nums[j];
                // ����������������ֵ���
                if (total > max) {
                    max = total;
                }
            }
        }
        return max;
    }

}
