package cn.javon.leetcode.easy._167_twosumii;

/**
 * @author Javon
 * @since 2018-03-09
 **/
public class RankingTwoSumII2 {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int comp = numbers[left] + numbers[right];
            if (comp == target) {
                return new int[]{left + 1, right + 1};
            } else if (comp > target) {
                right--;
            } else {
                left++;
            }
        }
        return null;
    }

}
