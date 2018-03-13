package cn.javon.leetcode.easy._169_majorityelement;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-03-13
 **/
public class TestMajorityElement {

    int[] nums1 = new int[]{1, 1, 2, 3, 4};
    int[] nums2 = new int[]{-1, 1, 1, 1, 2, 1};
    int[] nums = nums1;

    @Test
    public void testMyMajorityElement() {
        MyMajorityElement myMajorityElement = new MyMajorityElement();
        System.out.println(myMajorityElement.majorityElement(nums));
    }

    @Test
    public void testOfficialMajorityElement() {
        OfficialMajorityElement officialMajorityElement = new OfficialMajorityElement();
        System.out.println(officialMajorityElement.majorityElement(nums));
    }

}
