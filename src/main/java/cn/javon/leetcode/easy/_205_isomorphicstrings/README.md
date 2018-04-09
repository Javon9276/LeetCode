# 205. Isomorphic Strings
Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.

Note:

You may assume both s and t have the same length.

# 205. 同构字符串
给定两个字符串 s 和 t，判断它们是否是同构的。

如果 s 中的字符可以被替换最终变成 t ，则两个字符串是同构的。

所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。

例如，

给定 "egg", "add", 返回 true.

给定 "foo", "bar", 返回 false.

给定 "paper", "title", 返回 true.

注意：

你可以假设 s 和 t 具有相同的长度。

# My思路
用数组做映射。注意每次字典映射的时候赋值为i+1，这是为了防止跟第一次映射时候的赋值混淆。（因为数组的初始化赋值为0，若每次赋值为i，那么第一次赋值的时候也为0，这样就混淆了）。
```
public boolean isIsomorphic(String s, String t) {
    int[] mapS = new int[128];
    int[] mapT = new int[128];
    for(int i = 0; i < s.length(); i++){
        if(mapS[s.charAt(i)] != mapT[t.charAt(i)])
            return false;
        mapS[s.charAt(i)] = mapT[t.charAt(i)] = i + 1;
    }
    return true;
}
```