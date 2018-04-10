# 206. Reverse Linked List
Reverse a singly linked list.

Hint:

A linked list can be reversed either iteratively or recursively. Could you implement both?

# 206. 反转链表
反转一个单链表。

进阶:

链表可以迭代或递归地反转。你能否两个都实现一遍？

# My思路
例如链表是1->2->3->4，使用的方式是新建一个新链表，然后通过冒泡的方式进行重构链表，最终得到新链表.
```
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
```

# Official思路
通过递归方式进行
```
public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) return head;
    ListNode p = reverseList(head.next);
    head.next.next = head;
    head.next = null;
    return p;
}
```