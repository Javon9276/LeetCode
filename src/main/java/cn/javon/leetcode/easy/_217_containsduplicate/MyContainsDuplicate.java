package cn.javon.leetcode.easy._217_containsduplicate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Javon
 * @since 2018-04-12
 **/
public class MyContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> list = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
            if (list.size() == i) {
                return true;
            }
        }
        return false;
    }

}
