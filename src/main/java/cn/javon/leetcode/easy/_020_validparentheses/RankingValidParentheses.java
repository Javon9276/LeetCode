package cn.javon.leetcode.easy._020_validparentheses;

public class RankingValidParentheses {

    /**
     * 思路：
     * 1. 先定义一个与字符串长度相同的字符数组和定义一个index = 0进行下标管理。
     * 2. 如果遇到'(','[','{'则把左括号放入字符数组中，并且index + 1。
     * 3. 如果遇到')',']','}'，先判断index是否为0，如果为零说明前面没有左括号，返回false，如果不为零，index - 1，并且判断前一个括号是否匹配，不匹配返回false;
     * 4. 最后判断index是否为0，如果为零，说明所以括号都匹配或不存在括号，如果不为零，说明括号存在，但没有右括号。
     */
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int head = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack[head++] = c;
            } else if (c == '[') {
                stack[head++] = c;
            } else if (c == '{') {
                stack[head++] = c;
            } else if (c == ')') {
                if (head == 0) return false;
                if (stack[--head] != '(') return false;
            } else if (c == ']') {
                if (head == 0) return false;
                if (stack[--head] != '[') return false;
            } else if (c == '}') {
                if (head == 0) return false;
                if (stack[--head] != '{') return false;
            }
        }
        return head == 0;
    }

}
