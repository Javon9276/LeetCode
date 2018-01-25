package cn.javon.leetcode.easy._026_removeduplicatesfromsortedarray;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-01-24
 **/
public class TestRemoveDuplicatesfromSortedArray {

    private int[] nums = new int[]{1, 1, 2, 4, 4, 4, 5, 6, 7, 7};

    @Test
    public void testMyRemoveDuplicatesfromSortedArray() {
        MyRemoveDuplicatesfromSortedArray myRemoveDuplicatesfromSortedArray = new MyRemoveDuplicatesfromSortedArray();
        System.out.println(myRemoveDuplicatesfromSortedArray.removeDuplicates(nums));
    }

    @Test
    public void testOfficialRemoveDuplicatesfromSortedArray() {
        OfficialRemoveDuplicatesfromSortedArray officialRemoveDuplicatesfromSortedArray = new OfficialRemoveDuplicatesfromSortedArray();
        System.out.println(officialRemoveDuplicatesfromSortedArray.removeDuplicates(nums));
    }

}
