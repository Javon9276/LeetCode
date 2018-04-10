package cn.javon.leetcode.easy._206_reverselinkedlist;

/**
 * @author Javon
 * @since 2018-04-10
 **/
public class MyReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode listNode = new ListNode(0);
        while (head != null) {
            ListNode root = new ListNode(head.val);
            root.next = listNode.next;
            listNode.next = root;
            head = head.next;
        }
        return listNode.next;
    }

}
