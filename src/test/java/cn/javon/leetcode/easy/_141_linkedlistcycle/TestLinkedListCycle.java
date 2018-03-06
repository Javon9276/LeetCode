package cn.javon.leetcode.easy._141_linkedlistcycle;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Javon
 * @since 2018-03-06
 **/
public class TestLinkedListCycle {

    ListNode listNode;

    @Before
    public void initData() {
        /**
         * 1->2->3->2
         */
        listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        listNode3.next = listNode1;
        listNode2.next = listNode3;
        listNode1.next = listNode2;
        listNode.next = listNode1;

        /**
         * 3->2->0->-4
         */
//        listNode = new ListNode(3);
//        ListNode listNode1 = new ListNode(2);
//        ListNode listNode2 = new ListNode(0);
//        ListNode listNode3 = new ListNode(-4);
//        listNode2.next = listNode3;
//        listNode1.next = listNode2;
//        listNode.next = listNode1;
//        System.out.println(listNode);
    }

    @Test
    public void testOfficialLinkedListCycle() {
        OfficialLinkedListCycle officialLinkedListCycle = new OfficialLinkedListCycle();
        System.out.println(officialLinkedListCycle.hasCycle(listNode));
    }
}
