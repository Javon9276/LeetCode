package cn.javon.leetcode.easy._058_lengthoflastword;

/**
 * @author Javon
 * @since 2018-01-30
 **/
public class MyLengthOfLastWord {

    /**
     * ˼·��
     * ��ʵû��ʲô˼·����Ҫ�о������������е㲻��������Լ�����ܳɹ�
     */
    public int lengthOfLastWord(String s) {
        s = s.trim();
        if ("".equals(s)) return 0;
        return s.length() - s.lastIndexOf(" ") - 1;
    }

}
