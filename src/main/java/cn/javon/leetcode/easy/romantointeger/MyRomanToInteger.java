package cn.javon.leetcode.easy.romantointeger;

public class MyRomanToInteger {

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

}
