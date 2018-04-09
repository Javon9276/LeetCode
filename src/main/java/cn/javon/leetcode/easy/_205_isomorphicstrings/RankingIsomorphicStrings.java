package cn.javon.leetcode.easy._205_isomorphicstrings;

public class RankingIsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        boolean rs = true;
        if (s.length() != t.length()) {
            return false;
        }
        char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();

        int[] m = new int[256];
        int[] n = new int[256];
        for (int i = 0; i < ss.length; i ++) {
            if (m[ss[i]] != n[ts[i]]) {
                rs = false;
                break;
            }
            m[ss[i]] = n[ts[i]] = i + 1;
        }

        return rs;
    }

}
