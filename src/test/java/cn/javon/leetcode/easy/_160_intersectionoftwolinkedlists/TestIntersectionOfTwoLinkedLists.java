package cn.javon.leetcode.easy._160_intersectionoftwolinkedlists;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Javon
 * @since 2018-03-08
 **/
public class TestIntersectionOfTwoLinkedLists {

    ListNode headA;
    ListNode headB;

    @Before
    public void initData(){
        headA = new ListNode(1);
        headB = new ListNode(2);

        ListNode a1 = new ListNode(3);
        ListNode a2 = new ListNode(5);
        ListNode b1 = new ListNode(4);
        ListNode b2 = new ListNode(6);
        ListNode b3 = new ListNode(8);
        ListNode c1 = new ListNode(9);
        ListNode c2 = new ListNode(10);
        ListNode c3 = new ListNode(11);
        a1.next = a2;
        a2.next = c1;
        b1.next = b2;
        b2.next = b3;
        b3.next= c1;
        c1.next = c2;
        c2.next = c3;
        headA.next = a1;
        headB.next = b1;
    }


    @Test
    public void testMyIntersectionOfTwoLinkedLists(){
        MyIntersectionOfTwoLinkedLists myIntersectionOfTwoLinkedLists = new MyIntersectionOfTwoLinkedLists();
        System.out.println(myIntersectionOfTwoLinkedLists.getIntersectionNode(headA,headB));
    }

    @Test
    public void testRankingIntersectionOfTwoLinkedLists(){
        RankingIntersectionOfTwoLinkedLists rankingIntersectionOfTwoLinkedLists = new RankingIntersectionOfTwoLinkedLists();
        System.out.println(rankingIntersectionOfTwoLinkedLists.getIntersectionNode(headA,headB));
    }


}
