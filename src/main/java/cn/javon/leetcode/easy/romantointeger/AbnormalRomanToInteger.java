package cn.javon.leetcode.easy.romantointeger;

public class AbnormalRomanToInteger {

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

}
