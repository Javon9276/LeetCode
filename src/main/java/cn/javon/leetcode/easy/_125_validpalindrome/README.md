# Valid Palindrome
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,

`"A man, a plan, a canal: Panama"` is a palindrome.

`"race a car"` is not a palindrome.

Note:

Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.

# 验证回文字符串
给定一个字符串，确定它是否是回文，只考虑字母数字字符和忽略大小写。

例如：

`"A man, a plan, a canal: Panama" `是回文字符串。

`"race a car"` 不是回文字符串。

注意:

你有考虑过这个字符串可能是空的吗？ 在面试中这是一个很好的问题。

针对此题目，我们将空字符串定义为有效的回文字符串。

# My思路
1.使用Java内置方法进行处理：利用正在表达式把除了[a-z][A-Z][0-9]的数据去除，然后把字符变成小写，通过StringBuilder()的reverse()方法进行反转字符串，最后和原字符串进行对比，等到结果。
```
public boolean isPalindrome(String s) {
    if ("".equals(s)) return true;
    s = s.replaceAll("\\W", "").toLowerCase();
    return s.equals(new StringBuilder(s).reverse().toString());
}
```

2.编写getChar方法用户获取单个字符结果，作用主要是把除了[a-z][A-Z][0-9]的数据都替换成空，判断是空则比较下一个字符。
```
public boolean isPalindrome(String s) {
    int start = 0;
    int end = s.length() - 1;
    while (start < end) {
        while (start < end && getChar(s.charAt(start)) == 0) start++;
        while (start < end && getChar(s.charAt(end)) == 0) end--;
        if (getChar(s.charAt(start)) != getChar(s.charAt(end))) return false;
        start++;
        end--;
    }
    return true;
}

public char getChar(char c) {
    if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
        return c;
    } else if (c >= 'A' && c <= 'Z') {
        return (char) (c + 32);
    }
    return 0;
}
```

# Ranking思路
道理与方法2差距不是很大
```
public boolean isPalindrome(String s) {
    if (s == null || s.length() == 0) {
        return true;
    }

    int i = 0;
    int j = s.length() - 1;
    while (i < j) {
        //System.out.println("Coming to while loop for i " + i + " J " + j);
        char lc = s.charAt(i);
        char rc = s.charAt(j);

        if ((lc < 65 || lc > 90) && (lc < 97 || lc > 122) && (lc < 48 || lc > 57)) {
            //System.out.println("Came here for char A " + rc);
            i++;
            continue;
        }

        //System.out.println("OUTSIDE A Came here for char " + lc);
        if ((rc < 65 || rc > 90) && (rc < 97 || rc > 122) && (rc < 48 || rc > 57)) {
            //System.out.println("Came here for char B" + rc);
            j--;
            continue;
        }
        //System.out.println("OUTSIDE Came here for char B" + rc);
        if (lc != rc) { // Mean either a is upper case or a is lower case
            //System.out.println("Coming here for lc " + lc  +  " rc " + rc);
            if (lc >= 65 && lc <= 90) {
                return (lc - 'A') == (rc - 'a');
                // if a is upper case then substract a from A which will give you [0-26]
                // and substract rc from lower case which will also give you [0-26]
            }
            if (lc >= 97 && lc <= 122) {
                return (lc - 'a') == (rc - 'A');
                // if lc is lower case then substract lc from a(109) which will give you [0-26]
                // and substract rc from uppercase A(65) which will also give you [0-26]
            }
            return false;
        }
        i++;
        j--;
    }
    return true;
}
```