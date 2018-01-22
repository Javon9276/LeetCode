package cn.javon.leetcode.easy.longestcommonprefix;

/**
 * @author Javon
 * @since 2018-01-22
 **/
public class AbnormalLongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        int i = 1;
        while (i < strs.length) {
            while (strs[i].indexOf(prefix) != 0)
                prefix = prefix.substring(0, prefix.length() - 1);
            i++;
        }
        return prefix;
    }

}
