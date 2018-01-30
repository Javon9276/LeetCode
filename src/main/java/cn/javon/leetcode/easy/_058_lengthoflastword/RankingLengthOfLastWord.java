package cn.javon.leetcode.easy._058_lengthoflastword;

public class RankingLengthOfLastWord {

    /**
     * 感觉只是把代码优化一下
     */
    public int lengthOfLastWord(String s) {
        if (s == null)
            return 0;

        return s.trim().length() - s.trim().lastIndexOf(' ') - 1;
    }

}
