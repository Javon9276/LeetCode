# 14. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.

# 14. 最长公共前缀
编写一个函数来查找字符串数组中最长的公共前缀字符串。

# My思路
首先定义首个字符串为前缀，然后跟后续字符串一个一个字符进行对比，找到公共前缀并返回，一直对比字符串，直到得到前缀。
```
public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) {
        return "";
    }
    String prefix = strs[0];
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i < strs.length; i++) {
        int length = strs[i].length() > prefix.length() ? prefix.length() : strs[i].length();
        for (int j = 0; j < length; j++) {
            if (strs[i].charAt(j) == prefix.charAt(j)) {
                sb.append(strs[i].charAt(j));
            } else {
                break;
            }
        }
        prefix = sb.toString();
        sb.setLength(0);
    }
    return prefix;
}
```

# Official思路
通过循环获取字符串数组中字符串长度最小的值，再通过二分法进行字符切割对比。

整体比较难理解消化，但是使用二分法的确能够减少循环的次数。
```
public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0)
        return "";
    int minLen = Integer.MAX_VALUE;
    for (String str : strs)
        minLen = Math.min(minLen, str.length());
    int low = 1;
    int high = minLen;
    while (low <= high) {
        int middle = (low + high) / 2;
        if (isCommonPrefix(strs, middle))
            low = middle + 1;
        else
            high = middle - 1;
    }
    return strs[0].substring(0, (low + high) / 2);
}

private boolean isCommonPrefix(String[] strs, int len) {
    String str1 = strs[0].substring(0, len);
    for (int i = 1; i < strs.length; i++)
        if (!strs[i].startsWith(str1))
            return false;
    return true;
}
```

# Ranking思路
思路和my思路是一样的，只是简化了一部分操作，原本是一个一个字符对比，直接使用indexOf方法查询减少循环
```
public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0)
        return "";
    String prefix = strs[0];
    int i = 1;
    while (i < strs.length) {
        while (strs[i].indexOf(prefix) != 0)
            prefix = prefix.substring(0, prefix.length() - 1);
        i++;
    }
    return prefix;
}
```