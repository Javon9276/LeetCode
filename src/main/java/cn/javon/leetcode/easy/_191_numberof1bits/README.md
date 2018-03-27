# 191. Number of 1 Bits

Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).

For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.

# 191. 位1的个数

编写一个函数，输入是一个无符号整数，返回的是它所有 位1 的个数（也被称为汉明重量）。

例如，32位整数 '11' 的二进制表示为 00000000000000000000000000001011，所以函数返回3。

# My思路
暴力方法，把数字变成二进制字符数组，通过循环获取数组中的1
```
public int hammingWeight(int n) {
    char[] chars = Integer.toBinaryString(n).toCharArray();
    int count = 0;
    for (char c : chars){
        if (c == '1') count++;
    }
    return count;
}
```

# Official1思路
通过与运算符进行计算，根据与运算符的运算规律，只有两个位都是1，结果才是1。
```
public int hammingWeight(int n) {
    int bits = 0;
    int mask = 1;
    for (int i = 0; i < 32; i++) {
        if ((n & mask) != 0) {
            bits++;
        }
        mask <<= 1;
    }
    return bits;
}
```

# Official2思路
使用n&(n-1)的方法，假使 n =0x110101

X | n | n-1 | n&(n-1) 
---|---|---|---
step1 | 110101 | 110100 | 110100
step2 | 110100 | 110011 | 110000
step3 | 110000 | 101111 | 100000
step4 | 100000 | 011111 | 000000

发现有几个1，就循环几次n&(n-1)得到0，明显较于上者运行效率更高些。代码如下：
```
public int hammingWeight(int n) {
    int sum = 0;
    while (n != 0) {
        sum++;
        n &= (n - 1);
    }
    return sum;
}
```
