package cn.javon.leetcode.easy._009_palindromenumber;

/**
 * @author Javon
 * @since 2018-01-19
 **/
public class AbnormalPalindromeNumber {

    public boolean isPalindrome(int x) {
        // if(x==Integer.MIN_VALUE) return false;
        if (x < 0) return false; //isPalindrome(-x);
        if (x < 10) return true;

        int tens = 1;
        int tmp = x;
        while (tmp / 10 > 0) {
            tens *= 10;
            tmp = tmp / 10;
        }

        while (tens >= 10) {
            if (x / tens != x % 10) return false;
            x = x % tens / 10;
            tens /= 100;
        }
        return true;
    }

}
