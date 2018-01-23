package cn.javon.leetcode.easy._020_validparentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MyValidParentheses {

    /**
     * 思路：
     * 栈最典型的应用就是验证配对情况，
     * 作为有效的括号，有一个右括号就必定有一个左括号在前面，
     * 所以我们可以将左括号都push进栈中，遇到右括号的时候再pop来消掉。
     * 这里不用担心连续不同种类左括号的问题，因为有效的括号对最终还是会有紧邻的括号对。
     * 如栈中是({[，来一个]变成({，再来一个}，变成(。
     */
    public boolean isValid(String s) {

        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                case ']':
                case '}':
                    if (stack.empty() || c != map.get(stack.pop())) {
                        return false;
                    }
            }
        }
        return stack.isEmpty();
    }


}
