# 136. Single Number
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

# 136. 只出现一次的数字
给定一个整数数组，除了某个元素外其余元素均出现两次。请找出这个只出现一次的元素。

备注：

你的算法应该是一个线性时间复杂度。 你可以不用额外空间来实现它吗？

# My思路
程序一共运行两次循环，优先定一个大储物柜数组，节省时间。pan用来判断正数还是负数，如果数组值是负数则转成正数并且pan记数，使用数组的值作为下标存放在储物柜中，最后循环判断储物柜对应下标的值是否为1，则说明值只出现一次。

```
int[] lockers = new int[22000];

public int singleNumber(int[] nums) {
    // 判断正数还是负数
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
```
# Ranking思路
重点思路是在`res ^=  nums[i]`,`^= `是异或算法，把俩个值用二进制进行计算。
```
public int singleNumber(int[] nums) {
    if (nums == null || nums.length == 0) {
        return Integer.MIN_VALUE;
    }
    int res = nums[0];
    for (int i = 1; i < nums.length; i++) {
        res ^= nums[i];
    }
    return res;
}
```