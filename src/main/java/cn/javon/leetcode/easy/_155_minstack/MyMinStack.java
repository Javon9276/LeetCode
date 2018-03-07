package cn.javon.leetcode.easy._155_minstack;

/**
 * @author Javon
 * @since 2018-03-07
 **/
public class MyMinStack {

    int[] stack;
    int index = 0;
    int min = Integer.MAX_VALUE;

    public MyMinStack() {
        stack = new int[22000];
        index = 0;
    }

    public void push(int x) {
        if (min >= x) {
            stack[index++] = min;
            min = x;
        }
        stack[index++] = x;
    }

    public void pop() {
        if (min == stack[--index]) {
            min = stack[--index];
        }
    }

    public int top() {
        return stack[index - 1];
    }

    public int getMin() {
        return min;
    }

}
