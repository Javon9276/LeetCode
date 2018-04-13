# 219. Contains Duplicate II
Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

# 219. 存在重复 II
给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使 nums [i] = nums [j]，并且 i 和 j 的绝对差值最大为 k。

# My思路
使用Map承接数组和下标，判断num[i]是否存在，如果存在则对比他们的绝对差值和k的大小。

绝对差值就是 i - j 的绝对值
```
public boolean containsNearbyDuplicate(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
        if (!map.containsKey(nums[i])) {
            map.put(nums[i], i);
        } else {
            if (i - map.get(nums[i]) <= k)
                return true;
            map.put(nums[i], i);
        }

    }
    return false;
}
```