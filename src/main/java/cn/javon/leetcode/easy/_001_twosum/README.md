# 1. Two Sum
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
```
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
```

# 1. 两数之和
给定一个整数数列，找出其中和为特定值的那两个数。

你可以假设每个输入都只会有一种答案，同样的元素不能被重用。

示例:
```
给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
```

# My思路
暴力破解的方法很简单。遍历每个元素x并找出是否有另一个值等于target - x
```
public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] == target - nums[i]) {
                return new int[]{i, j};
            }
        }
    }
    throw new IllegalArgumentException("No two sum solution");
}
```

# Official思路
为了提高运行时复杂度，我们需要一种更有效的方法来检查数组中是否存在补码。如果存在补充，我们需要查找它的索引。维护数组中每个元素到其索引的映射的最佳方法是什么？散列表。

Java是用Map进行存储数组中的数据，如果不适合的数据则插入Map中，如果合适就输出数据。
```
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[]{map.get(complement), i};
        }
        map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
}
```

# Ranking思路
思路和Official相差不大，只是使用新数组和Map的区别，定义一个大新数组，把给定数组的值作为新数组下标，下标作为新数组值，通过运算去数组中获取值查看结果。
```
public int[] twoSum(int[] nums, int target) {
    int[] map = new int[20050];
    int size = 4;
    for (int i = 0; i < nums.length; i++) {
        map[nums[i] + size] = (i + 1);
        int diff = target - nums[i + 1] + size;
        if (diff < 0) continue;
        int d = map[diff];
        if (d > 0)
            return new int[]{d - 1, i + 1};
    }
    return null;
}
```