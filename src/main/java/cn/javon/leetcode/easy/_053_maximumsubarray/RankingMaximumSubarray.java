package cn.javon.leetcode.easy._053_maximumsubarray;

/**
 * @author Javon
 * @since 2018-01-29
 **/
public class RankingMaximumSubarray {

    /**
     * ֻѭ��һ��
     */
    public int maxSubArray(int[] nums) {
        int max = nums[0];// ���ֵ
        int total = nums[0];// ���������
        for (int i = 1; i < nums.length; i++) {
            // �����ǰֵ�������������뵱ǰֵ�ĺ�
            if (nums[i] > total + nums[i]) {
                // ��������͵��ڸ�ֵ
                total = nums[i];
            } else {
                // ��������� = ��������� + ��ǰֵ
                total = total + nums[i];
            }
            if (total > max) {
                max = total;
            }
        }
        return max;
    }

    public int maxSubArray2(int[] nums) {
        int maxEndingHere = 0, maxSoFar = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            maxEndingHere += nums[i];
            if (maxEndingHere > maxSoFar) maxSoFar = maxEndingHere;
            if (maxEndingHere < 0) maxEndingHere = 0;
        }
        return maxSoFar;
    }
}
