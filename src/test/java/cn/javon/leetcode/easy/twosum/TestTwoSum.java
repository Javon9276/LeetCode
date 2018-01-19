package cn.javon.leetcode.easy.twosum;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-01-19
 **/
public class TestTwoSum {

    private int[] nums = new int[]{2, 7, 11, 15};
    private int target = 9;

    @Test
    public void testMyTwoSum() {
        MyTwoSum myTwoSum = new MyTwoSum();
        myTwoSum.twoSum(nums, target);
    }

    @Test
    public void testExcellentTwoSum() {
        ExcellentTwoSum excellentTwoSum = new ExcellentTwoSum();
        excellentTwoSum.twoSum(nums, target);
    }

    public void testAbnormalTwoSum() {
        AbnormalTwoSum abnormalTwoSum = new AbnormalTwoSum();
        abnormalTwoSum.twoSum(nums, target);
    }

}
