# 172. Factorial Trailing Zeroes
Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.

# 172. 阶乘后的零
给定一个整数 n，返回 n! 结果尾数中零的数量。

注意: 你的解决方案应为对数时间复杂度。

# 思路
分解因子, 当且仅当 因子中出现 一对 (2,5)时, 最后结果会增加一个 trailing zero.
1.  2的个数永远多于5个个数.
2.  计算5的个数时, 最简单的方法是 SUM(N/5^1,  N/5^2, N/5^3...)
```
假如i可以被5整除，则可以提供的5的个数为i/5个 
假如i可以被25整除，则可以多提供的5的个数为i/25个 
假如i可以被125整除，则可以多提供的5的个数为i/125个（算上了被5，25整除之后） 
。。。 
```