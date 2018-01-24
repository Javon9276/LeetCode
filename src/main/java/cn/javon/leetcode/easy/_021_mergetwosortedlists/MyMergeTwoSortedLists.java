package cn.javon.leetcode.easy._021_mergetwosortedlists;

public class MyMergeTwoSortedLists {

    /**
     * 思路：
     * 通过递归，不断取两个链表中最小的组成新的链表，然后得到最后的链表
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val > l2.val) {
            ListNode node = l2;
            node.next = mergeTwoLists(l1, l2.next);
            return node;
        } else {
            ListNode node = l1;
            node.next = mergeTwoLists(l1.next, l2);
            return node;
        }
    }

}
