package cn.javon.leetcode.easy._206_reverselinkedlist;

/**
 * @author Javon
 * @since 2018-02-06
 **/
public class ListNode {

    int val;

    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
