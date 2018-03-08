package cn.javon.leetcode.easy._160_intersectionoftwolinkedlists;

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
        return val + "->" + next;
    }
}
