# 190. Reverse Bits
Reverse bits of a given 32 bits unsigned integer.

For example, given input `43261596` (represented in binary as `00000010100101000001111010011100`), return `964176192` (represented in binary as `00111001011110000010100101000000`).

Follow up:

If this function is called many times, how would you optimize it?

# 190. 颠倒二进制位
颠倒给定的32位无符号整数的二进制位。

例如，给定输入 `43261596`（二进制表示为 `00000010100101000001111010011100` ），返回 `964176192`（二进制表示为 `00111001011110000010100101000000`）。

问题进阶:

如果多次调用这个函数，你将如何优化它？

# OfficialReverseBits1思路
移位法:最简单的做法，原数不断右移取出最低位，赋给新数的最低位后新数再不断左移。
```
public int reverseBits(int n) {
    int result = 0;
    for (int i = 0; i < 32; i++) {
        result += n & 1;
        n >>>= 1;   // CATCH: must do unsigned shift
        if (i < 31) // CATCH: for last digit, don't shift!
            result <<= 1;
    }
    return result;
}
```

# OfficialReverseBits2思路
Q：如果多次调用这个函数，你将如何优化它？

A：这其实才是这道题的精髓，考察的大规模数据时算法最基本的优化方法。其实道理很简单，反复要用到的东西记下来就行了，所以我们用Map记录之前反转过的数字和结果。更好的优化方法是将其按照Byte分成4段存储，节省空间
```
private final Map<Byte, Integer> cache = new HashMap<Byte, Integer>();

public int reverseBits(int n) {
    byte[] bytes = new byte[4];
    for (int i = 0; i < 4; i++) // convert int into 4 bytes
        bytes[i] = (byte) ((n >>> 8 * i) & 0xFF);
    int result = 0;
    for (int i = 0; i < 4; i++) {
        result += reverseByte(bytes[i]); // reverse per byte
        if (i < 3)
            result <<= 8;
    }
    return result;
}

private int reverseByte(byte b) {
    Integer value = cache.get(b); // first look up from cache
    if (value != null)
        return value;
    value = 0;
    // reverse by bit
    for (int i = 0; i < 8; i++) {
        value += ((b >>> i) & 1);
        if (i < 7)
            value <<= 1;
    }
    cache.put(b, value);
    return value;
}
```

# Ranking思路
分段相或法:Java标准的Integer.reverse()源码。
```
public int reverseBits(int n) {
    int res = n;
    res = res << 16 | res >>> 16;
    res = (res & 0x00ff00ff) << 8 | (res & 0xff00ff00) >>> 8;
    res = (res & 0x0f0f0f0f) << 4 | (res & 0xf0f0f0f0) >>> 4;
    res = (res & 0x33333333) << 2 | (res & 0xcccccccc) >>> 2;
    res = (res & 0x55555555) << 1 | (res & 0xaaaaaaaa) >>> 1;
    return res;
}
```