package cn.javon.leetcode.easy._167_twosumii;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Javon
 * @since 2018-03-08
 **/
public class MyTwoSumII {

    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            int result = target - numbers[i];
            if (map.containsKey(result)) {
                return new int[]{map.get(result), i + 1};
            }
            map.put(numbers[i], i + 1);
        }
        return null;
    }

}
