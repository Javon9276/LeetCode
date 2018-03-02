package cn.javon.leetcode.easy._125_validpalindrome;

/**
 * @author Javon
 * @since 2018-03-02
 **/
public class MyValidPalindrome {

    public boolean isPalindrome1(String s) {
        if ("".equals(s)) return true;
        s = s.replaceAll("\\W", "").toLowerCase();
        return s.equals(new StringBuilder(s).reverse().toString());
    }

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

}
