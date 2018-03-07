package cn.javon.leetcode.easy._155_minstack;

import java.util.Stack;

public class RankingMinStack1 {

    Stack<Integer> stack;
    int min;

    public RankingMinStack1() {
        stack = new Stack<Integer>();
        min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        if (x <= min) {
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        int pop = stack.pop();
        if (pop == min)
            min = stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }

}
