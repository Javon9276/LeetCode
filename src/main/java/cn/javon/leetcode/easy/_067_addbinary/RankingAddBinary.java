package cn.javon.leetcode.easy._067_addbinary;

public class RankingAddBinary {

    public String addBinary(String a, String b) {
        if (a.length() > b.length()) {
            // add to arr1
            return addToA(a.toCharArray(), b);
        } else {
            // add to arr2
            return addToA(b.toCharArray(), a);
        }
    }

    private String addToA(char[] a, String b) {
        int x = a.length - 1;
        int y = b.length() - 1;
        int remain = 0;
        while (y >= 0) {
            int sum = remain + a[x] - '0' + b.charAt(y) - '0';
            a[x--] = (char)(sum % 2 + '0');
            remain = sum / 2;
            y--;
        }
        while (x >= 0 && remain > 0) {
            int sum = remain + a[x] - '0';
            a[x--] = (char)(sum % 2 + '0');
            remain = sum / 2;
        }
        if (remain == 0) {
            return String.valueOf(a);
        } else {
            return "1" + String.valueOf(a);
        }
    }

}
