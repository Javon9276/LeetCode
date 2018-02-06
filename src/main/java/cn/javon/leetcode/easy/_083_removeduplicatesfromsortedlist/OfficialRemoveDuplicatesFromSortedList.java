package cn.javon.leetcode.easy._083_removeduplicatesfromsortedlist;

public class OfficialRemoveDuplicatesFromSortedList {

    /*
    用current来接收节点，
    判断该节点和下一个节点的值是否一致，
    如果一样就把下个节点换成下下个节点
    不一样则把下个节点赋值给current，
    一个节点一个节点的检查
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

}
