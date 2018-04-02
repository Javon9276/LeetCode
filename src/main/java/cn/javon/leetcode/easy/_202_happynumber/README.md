# 202. Happy Number
Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 19 is a happy number
```
1² + 9² = 82
8² + 2² = 68
6² + 8² = 100
1² + 0² + 0² = 1
```

# 202. 快乐数
写一个算法来判断一个数是不是“快乐数”。

一个数是不是快乐是这么定义的：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，或是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。

案例: 19 是一个快乐数。
```
1² + 9² = 82
8² + 2² = 68
6² + 8² = 100
1² + 0² + 0² = 1
```

# My思路
因为最终导致死循环的原因是结果出现不是1，但重复出现过。所以只要存储计算过的结果判断是否存在就可以确定结果是否为快乐数。
```
public boolean isHappy(int n) {
    Set<Integer> result = new HashSet<Integer>();
    while (n != 1) {
        if (result.contains(n))
            return false;
        result.add(n);
        int sum = 0;
        while (n != 0) {
            int remainder = n % 10;
            sum += remainder * remainder;
            n /= 10;
        }
        n = sum;
    }
    return true;
}
```

# Ranking思路
计算结果中只要出现4，全部都不是快乐数。
```
public boolean isHappy(int n) {
    while (n != 1) {
        n = getnum(n);
        if (n == 4) {
            return false;
        }
    }
    return true;
}

public int getnum(int n) {
    int sum = 0;
    while (n != 0) {
        sum += (n % 10) * (n % 10);
        n /= 10;
    }
    return sum;
}
```