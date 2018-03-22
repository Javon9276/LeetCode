package cn.javon.leetcode.easy._009_palindromenumber;

/**
 * @author Javon
 * @since 2018-01-19
 **/
public class MyPalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String str = String.valueOf(x);
        StringBuilder sb = new StringBuilder(str);
        if (str.equals(sb.reverse().toString())) {
            return true;
        }
        return false;
    }

}
