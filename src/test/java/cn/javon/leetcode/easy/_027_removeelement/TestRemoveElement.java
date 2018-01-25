package cn.javon.leetcode.easy._027_removeelement;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-01-25
 **/
public class TestRemoveElement {

    int[] nums = new int[]{3, 2, 2, 3, 4, 3, 3};
    int val = 3;

    @Test
    public void testMyRemoveElement() {
        MyRemoveElement myRemoveElement = new MyRemoveElement();
        System.out.println(myRemoveElement.removeElement(nums, val));
    }

}
