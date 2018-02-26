# Reverse Integer
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:
```
Input: 123
Output:  321
```

Example 2:
```
Input: -123
Output: -321
```

Example 3:
```
Input: 120
Output: 21
```
Note:

Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

# 颠倒整数
给定一个范围为 32 位 int 的整数，将其颠倒。

例子 1:
```
输入: 123
输出:  321
```

例子 2:
```
输入: -123
输出: -321
```

例子 3:
```
输入: 120
输出: 21
```
注意:

假设我们的环境只能处理 32 位 int 范围内的整数。根据这个假设，如果颠倒后的结果超过这个范围，则返回 0。

# My思路
把整数变成字符串数组，再把数组颠倒过来转换成整数，针对一些特殊操作进行特殊处理
```
public int reverse(int x) {
    char[] chars = String.valueOf(x).toCharArray();
    int length = chars.length;
    char charP = '0';
    if (!Character.isDigit(chars[0])) {
        charP = chars[0];
        length--;
    }
    char[] newChars = new char[length];
    for (int i = 0; i < length; i++) {
        newChars[i] = chars[chars.length - i - 1];
    }
    long result = Long.parseLong(String.valueOf(charP) + String.valueOf(newChars));
    if (result > Integer.MAX_VALUE) return 0;
    if (result < Integer.MIN_VALUE) return 0;
    return (int) result;
}
```

# Official思路
通过获取余数的方式进行颠倒整数。注意以防止数据溢出。
```
public int reverse(int x) {
    long result = 0;
    while (x != 0) {
        result = (result * 10) + (x % 10);
        if (result > Integer.MAX_VALUE) return 0;
        if (result < Integer.MIN_VALUE) return 0;
        x = x / 10;
    }
    return (int) result;
}
```

# Ranking思路
思路与Official思路是一致的
```
public int reverse(int x) {
    int output = 0;
    while (true) {
        if (x == 0) {
            return x;
        }
        output = output * 10 + x % 10;
        if ((x /= 10) == 0) {
            return output;
        }
        if (output > 214748364 || output < -214748364) {
            return 0;
        }
    }
}
```
