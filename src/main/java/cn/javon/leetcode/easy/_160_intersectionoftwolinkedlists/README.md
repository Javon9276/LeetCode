# 160. Intersection of Two Linked Lists
Write a program to find the node at which the intersection of two singly linked lists begins.


For example, the following two linked lists:
```
A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗            
B:     b1 → b2 → b3
```
begin to intersect at node c1.

Notes:

* If the two linked lists have no intersection at all, return null.
* The linked lists must retain their original structure after the function returns.
* You may assume there are no cycles anywhere in the entire linked structure.
* Your code should preferably run in O(n) time and use only O(1) memory.

Credits:

Special thanks to @stellari for adding this problem and creating all test cases.

# 160. 相交链表
编写一个程序，找到两个单链表相交的起始节点。

例如，下面的两个链表：
```
A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗            
B:     b1 → b2 → b3
```
在节点 c1 开始相交。

注意：
* 如果两个链表没有交点，返回 null.
* 在返回结果后，两个链表仍须保持原有的结构。
* 可假定整个链表结构中没有循环。
* 程序尽量满足 O(n) 时间复杂度，且仅用 O(1) 内存。

致谢:

特别感谢 @stellari 添加此问题并创建所有测试用例。

# My思路
最近老是使用大数组承接数据做运算，感觉要更改了自身的习惯才行。

使用大数组承接headA的每个节点，然后再循环判断headB的数据是否符合。
```
ListNode[] listNodes = new ListNode[1000];

public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    while (headA != null) {
        listNodes[headA.val] = headA;
        headA = headA.next;
    }
    while (headB != null) {
        if (listNodes[headB.val] == headB) {
            return headB;
        }
        headB = headB.next;
    }
    return null;
}
```

# Ranking思路
思路是运用了A点追B点的原则，如果A到尽头则重新走，直到走到他们值相等为止。
```
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
     if (headA == null || headB == null) return null;
     ListNode a = headA;
     ListNode b = headB;
     while (a != b) {
         a = a == null ? headB : a.next;
         b = b == null ? headA : b.next;
     }
     return a;
 }
```