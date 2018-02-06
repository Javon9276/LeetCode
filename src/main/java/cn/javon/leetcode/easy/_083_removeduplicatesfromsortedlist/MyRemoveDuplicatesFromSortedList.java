package cn.javon.leetcode.easy._083_removeduplicatesfromsortedlist;

/**
 * @author Javon
 * @since 2018-02-06
 **/
public class MyRemoveDuplicatesFromSortedList {

    /*
    使用递归处理当前节点，没啥好说的
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        if (head.next != null) {
            head.next = deleteDuplicates(head.next);
            if (head.val == head.next.val) {
                head = head.next;
            }
        }
        return head;
    }

}
