package cn.javon.leetcode.easy._136_singlenumber;

/**
 * @author Javon
 * @since 2018-03-05
 **/
public class MySingleNumber {

    int[] lockers = new int[22000];

    public int singleNumber(int[] nums) {
        int pan = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                pan *= -1;
                nums[i] *= -1;
            }
            if (lockers[nums[i]] == 0)
                lockers[nums[i]] = 1;
            else
                lockers[nums[i]] = 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (lockers[nums[i]] != 0) return pan * nums[i];
        }
        return 0;
    }

}
