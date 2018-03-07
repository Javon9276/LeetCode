# 155. Min Stack
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

* push(x) -- Push element x onto stack.
* pop() -- Removes the element on top of the stack.
* top() -- Get the top element.
* getMin() -- Retrieve the minimum element in the stack.

Example:
```
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.
```

# 155. 最小栈
设计一个支持 push，pop，top 操作，并能在常量时间内检索最小元素的栈。

* push(x) -- 将元素x推入栈中。
* pop() -- 删除栈顶的元素。
* top() -- 获取栈顶元素。
* getMin() -- 检索栈中的最小元素。

示例:
```
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> 返回 -3.
minStack.pop();
minStack.top();      --> 返回 0.
minStack.getMin();   --> 返回 -2.
```

# My思路
思路来自于Ranking1使用大数组stack存储数据和index进行下标计算，min进行对比最小值
* push方法，先判断存入值是否是最小值，如果是最小值则先把min值放入stack中，再把存入值放入数组中，并且把存入值赋给min，index计算数组个数
* pop方法，先判断取出值是否是最小值，如果是最小值则取出前一位的数组值赋予min，index进行计算
* top方法就是获取下标为index-1的值
* getMin方法就是获取数组的最小值
```
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
```

# Ranking1思路
使用Java的栈堆进行存储，对于最小值的逻辑，
* push方法，只要存入值是最小值就把第二小的值再放入栈堆中，再把存入值放入栈堆中
* pop方法，取出值的同时判断值是否最小，如果是最小则把第二小值赋予min
```
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
```

# Ranking2思路
使用指针进行存放数据，每个指针都存放着当前值和对应的最小值
```
private Node stack;

public RankingMinStack2() {
}

public void push(int x) {
    if (stack == null) {
        stack = new Node(x, x, null);
    } else {
        stack = new Node(x, Math.min(x, stack.min), stack);
    }
}

public void pop() {
    stack = stack.next;
}

public int top() {
    return stack.value;
}

public int getMin() {
    return stack.min;
}

private class Node {
    private int value;
    private Node next;
    private int min;

    Node(int v, int m, Node n) {
        value = v;
        min = m;
        next = n;
    }
}
```