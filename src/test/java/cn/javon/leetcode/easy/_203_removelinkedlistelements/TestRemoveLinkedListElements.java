package cn.javon.leetcode.easy._203_removelinkedlistelements;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Javon
 * @since 2018-04-03
 **/
public class TestRemoveLinkedListElements {

    ListNode head;
    int val = 9;

    @Before
    public void init() {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(6);
        ListNode ln4 = new ListNode(3);
        ListNode ln5 = new ListNode(4);
        ListNode ln6 = new ListNode(5);
        ListNode ln7 = new ListNode(6);
        ln6.next = ln7;
        ln5.next = ln6;
        ln4.next = ln5;
        ln3.next = ln4;
        ln2.next = ln3;
        ln1.next = ln2;
        head = ln1;
        val = 6;

//        ListNode ln1 = new ListNode(1);
//        ListNode ln2 = new ListNode(1);
//        ln1.next = ln2;
//        head = ln1;
//        val = 1;
    }

    @Test
    public void testMyRemoveLinkedListElements() {
        System.out.println(head);
        MyRemoveLinkedListElements myRemoveLinkedListElements = new MyRemoveLinkedListElements();
        System.out.println(myRemoveLinkedListElements.removeElements(head, val));
    }

}
