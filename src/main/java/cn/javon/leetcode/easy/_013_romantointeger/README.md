# 13. Roman to Integer
Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.

# 13. 罗马数字转整数
给定一个罗马数字，将其转换成整数。

返回的结果要求在 1 到 3999 的范围内。

# 科普
## 罗马与阿拉伯数字对应关系
罗马数字 | 阿拉伯数字
---|---
I | 1
V | 5
X | 10
L | 50
C | 100
D | 500
M | 1000

## 罗马数字计算规则
1. 相同的数字连写、所表示的数等于这些数字相加得到的数、如：Ⅲ=3；
2. 小的数字在大的数字的右边、所表示的数等于这些数字相加得到的数、 如：Ⅷ=8、Ⅻ=12；
3. 小的数字（限于 I、X 和 C）在大的数字的左边、所表示的数等于大数减小数得到的数、如：Ⅳ=4、Ⅸ=9；
    1. V 和 X 左边的小数字只能用I。
    2. L 和 C 左边的小数字只能用X。
    3. D 和 M 左边的小数字只能用C 。
4. 正常使用时、连写的数字重复不得超过三次；
5. 在一个数的上面画一条横线、表示这个数扩大 1000 倍。

## 程序相关内容
1. 在题目中有规定“输入保证在1到3999的范围内”，所以不存在第4条规则。

# My思路
按照罗马数字规则进行计算，没有什么特色。
```
public int romanToInt(String s) {
    int i = 1, total = 0, pre = 0, cur = 0;
    total = charToInt(s.charAt(0));
    for (; i < s.length(); i++) {
        pre = charToInt(s.charAt(i - 1));
        cur = charToInt(s.charAt(i));
        if (pre < cur) {
            total = total + cur - 2 * pre;
        } else {
            total += cur;
        }
    }
    return total;
}

public int charToInt(char c) {
    int data = 0;
    switch (c) {
        case 'I':
            data = 1;
            break;
        case 'V':
            data = 5;
            break;
        case 'X':
            data = 10;
            break;
        case 'L':
            data = 50;
            break;
        case 'C':
            data = 100;
            break;
        case 'D':
            data = 500;
            break;
        case 'M':
            data = 1000;
            break;
        default:
            data = 0;
            break;
    }
    return data;
}
```

# Ranking思路
对罗马规则第三点进行结合，得到的逻辑组合是 IV,IX,XL,XC,CD,CM
```
public int romanToInt(String s) {
    int result = 0;
    if (s.indexOf("IV") > -1) {
        result -= 2;
    }
    if (s.indexOf("IX") > -1) {
        result -= 2;
    }
    if (s.indexOf("XL") > -1) {
        result -= 20;
    }
    if (s.indexOf("XC") > -1) {
        result -= 20;
    }
    if (s.indexOf("CD") > -1) {
        result -= 200;
    }
    if (s.indexOf("CM") > -1) {
        result -= 200;
    }

    char[] Arr = s.toCharArray();

    for (int i = 0; i < Arr.length; i++) {
        if (Arr[i] == 'M') result += 1000;
        if (Arr[i] == 'D') result += 500;
        if (Arr[i] == 'C') result += 100;
        if (Arr[i] == 'L') result += 50;
        if (Arr[i] == 'X') result += 10;
        if (Arr[i] == 'V') result += 5;
        if (Arr[i] == 'I') result += 1;
    }
    return result;
}
```