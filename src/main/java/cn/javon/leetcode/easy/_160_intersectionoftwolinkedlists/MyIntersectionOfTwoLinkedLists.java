package cn.javon.leetcode.easy._160_intersectionoftwolinkedlists;

/**
 * @author Javon
 * @since 2018-03-08
 **/
public class MyIntersectionOfTwoLinkedLists {

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

}
