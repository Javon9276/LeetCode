package cn.javon.leetcode.easy._014_longestcommonprefix;

/**
 * @author Javon
 * @since 2018-01-23
 **/
public class MyLongestCommonPrefix {

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

}
