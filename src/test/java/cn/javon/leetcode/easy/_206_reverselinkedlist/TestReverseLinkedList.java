package cn.javon.leetcode.easy._206_reverselinkedlist;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Javon
 * @since 2018-04-10
 **/
public class TestReverseLinkedList {

    ListNode listNode;

    @Before
    public void initData() {
        /**
         * 3->2->0->-4
         */
        listNode = new ListNode(3);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(0);
        ListNode listNode3 = new ListNode(-4);
        listNode2.next = listNode3;
        listNode1.next = listNode2;
        listNode.next = listNode1;
        System.out.println(listNode);
    }

    @Test
    public void testMyReverseLinkedList() {
        MyReverseLinkedList myReverseLinkedList = new MyReverseLinkedList();
        System.out.println(myReverseLinkedList.reverseList(listNode));
    }

    @Test
    public void testOfficialReverseLinkedList() {
        OfficialReverseLinkedList officialReverseLinkedList = new OfficialReverseLinkedList();
        System.out.println(officialReverseLinkedList.reverseList(listNode));
    }

}
