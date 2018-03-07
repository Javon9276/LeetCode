package cn.javon.leetcode.easy._155_minstack;

import org.junit.Test;

/**
 * @author Javon
 * @since 2018-03-07
 **/
public class TestMinStack {

    @Test
    public void testMyMinStack(){
        MyMinStack myMinStack = new MyMinStack();
        myMinStack.push(-2);
        myMinStack.push(0);
        myMinStack.push(-3);
        myMinStack.getMin();
        myMinStack.pop();
        myMinStack.top();
        myMinStack.getMin();
    }

    @Test
    public void testRankingMinStack1(){
        RankingMinStack1 rankingMinStack1 = new RankingMinStack1();
        rankingMinStack1.push(-2);
        rankingMinStack1.push(0);
        rankingMinStack1.push(-3);
        rankingMinStack1.getMin();
        rankingMinStack1.pop();
        rankingMinStack1.top();
        rankingMinStack1.getMin();
    }
    @Test
    public void testRankingMinStack2(){
        RankingMinStack2 rankingMinStack2 = new RankingMinStack2();
        rankingMinStack2.push(-2);
        rankingMinStack2.push(0);
        rankingMinStack2.push(-3);
        rankingMinStack2.getMin();
        rankingMinStack2.pop();
        rankingMinStack2.top();
        rankingMinStack2.getMin();
    }

}
