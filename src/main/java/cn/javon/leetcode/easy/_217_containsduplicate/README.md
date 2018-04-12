# 217. Contains Duplicate
Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

# 217. 存在重复
给定一个整数数组，判断是否存在重复元素。

如果任何值在数组中出现至少两次，函数应该返回 true。如果每个元素都不相同，则返回 false。

# My思路
通过Set集合进行对比数据个数是否正常，Set特性就是不存放重复值。
```
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
```

# Ranking思路
其实思路都是对整数进行排序，然后得到比较前一个值和当前值进行对比是否一样。

第一段代码其实就是一边排序一边进行对比，所以速度更加快一点。
```
public boolean containsDuplicate(int[] nums) {
    for (int i = 1; i < nums.length; i++){
        int j =  i - 1;
        int k = nums[j+1];
        while(j > -1&& nums[j] > k){
            nums[j+1]=nums[j];
            j--;
        }
        nums[j+1] = k;
        if(j  > -1){
            if(nums[j] == nums[j +1]){
                return true;
            }
        }
    }
    return false;
}

public boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums);
    for (int i=1; i<nums.length; i++){
        if (nums[i-1] == nums[i]) return true;
    }
    return false;
}
```