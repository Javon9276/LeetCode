package cn.javon.leetcode.easy._007_reverseinteger;

/**
 * @author Javon
 * @since 2018-01-19
 **/
class MyReverseInteger {

    public int reverse(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        int length = chars.length;
        char charP = '0';
        if (!Character.isDigit(chars[0])) {
            charP = chars[0];
            length--;
        }
        char[] newChars = new char[length];
        for (int i = 0; i < length; i++) {
            newChars[i] = chars[chars.length - i - 1];
        }
        long result = Long.parseLong(String.valueOf(charP) + String.valueOf(newChars));
        if (result > Integer.MAX_VALUE) return 0;
        if (result < Integer.MIN_VALUE) return 0;
        return (int) result;
    }

}
