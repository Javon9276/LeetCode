# 141. Linked List Cycle
Given a linked list, determine if it has a cycle in it.

Follow up:

Can you solve it without using extra space?

# 141. 环形链表
给定一个链表，判断链表中否有环。

补充：

你是否可以不用额外空间解决此题？

# Official思路
```
public boolean hasCycle(ListNode head) {
    if (head == null || head.next == null) {
        return false;
    }
    ListNode slow = head;
    ListNode fast = head.next;
    while (slow != fast) {
        if (fast == null || fast.next == null) {
            return false;
        }
        slow = slow.next;
        fast = fast.next.next;
    }
    return true;
}
```