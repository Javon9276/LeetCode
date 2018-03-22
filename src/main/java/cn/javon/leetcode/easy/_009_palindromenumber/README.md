# 9. Palindrome Number
Determine whether an integer is a palindrome. Do this without extra space.

Some hints:

Could negative integers be palindromes? (ie, -1)

If you are thinking of converting the integer to string, note the restriction of using extra space.

You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?

There is a more generic way of solving this problem.

# 9. 回文数
判断一个整数是否是回文数。不能使用辅助空间。

一些提示:

负整数可以是回文数吗？（例如 -1）

如果你打算把整数转为字符串，请注意不允许使用辅助空间的限制。

你也可以考虑将数字颠倒。但是如果你已经解决了 “颠倒整数” 问题的话，就会注意到颠倒整数时可能会发生溢出。你怎么来解决这个问题呢？

本题有一种比较通用的解决方式。

# My思路
使用Java的StringBuilder的字符串转置，然后前后两者进行对比并返回结果。
```
public boolean isPalindrome(int x) {
    if (x < 0) {
        return false;
    }
    String str = String.valueOf(x);
    StringBuilder sb = new StringBuilder(str);
    if (str.equals(sb.reverse().toString())) {
        return true;
    }
    return false;
}
```

# Official思路
通过计算的方式进行判断是否是回文
1. 使用revertedNumber接收数字反转的结果
2. `x % 10`能够获取个位的值，结合`x /= 10`的循环能够获取所有位数上的值
3. `revertedNumber * 10`能够让个位上的数值能够进位
4. 最后判断x和revertedNumber（revertedNumber/10）的值是否一致
```
public boolean isPalindrome(int x) {
    if (x < 0 || (x % 10 == 0 && x != 0)) {
        return false;
    }
    int revertedNumber = 0;
    while (x > revertedNumber) {
        revertedNumber = revertedNumber * 10 + x % 10;
        x /= 10;
    }
    return x == revertedNumber || x == revertedNumber / 10;
}
```

# Ranking思路
Ranking的想法其实和Official想法差距不是特别大，Ranking想法是对前后都进行切割。
```
public boolean isPalindrome(int x) {
    if (x < 0) return false;
    if (x < 10) return true;
    int tens = 1;
    int tmp = x;
    while (tmp / 10 > 0) {
        tens *= 10;
        tmp = tmp / 10;
    }
    while (tens >= 10) {
        if (x / tens != x % 10) return false;
        x = x % tens / 10;
        tens /= 100;
    }
    return true;
}
```