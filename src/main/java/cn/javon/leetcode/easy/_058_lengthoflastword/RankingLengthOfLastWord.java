package cn.javon.leetcode.easy._058_lengthoflastword;

public class RankingLengthOfLastWord {

    /**
     * �о�ֻ�ǰѴ����Ż�һ��
     */
    public int lengthOfLastWord(String s) {
        if (s == null)
            return 0;

        return s.trim().length() - s.trim().lastIndexOf(' ') - 1;
    }

}
