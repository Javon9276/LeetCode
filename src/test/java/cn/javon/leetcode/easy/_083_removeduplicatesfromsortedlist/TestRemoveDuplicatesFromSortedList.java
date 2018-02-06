package cn.javon.leetcode.easy._083_removeduplicatesfromsortedlist;

import cn.javon.leetcode.easy._021_mergetwosortedlists.MyMergeTwoSortedLists;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Javon
 * @since 2018-02-06
 **/
public class TestRemoveDuplicatesFromSortedList {

    private ListNode head;
    private ListNode head1;
    private ListNode head2;

    @Before
    public void initData() {
        System.out.println("init data");
        head1 = new ListNode(1);
        ListNode ln11 = new ListNode(1);
        ListNode ln12 = new ListNode(2);
        ln11.next = ln12;
        head1.next = ln11;


        head2 = new ListNode(1);
        ListNode ln21 = new ListNode(1);
        ListNode ln22 = new ListNode(2);
        ListNode ln23 = new ListNode(3);
        ListNode ln24 = new ListNode(3);
        ListNode ln25 = new ListNode(4);
        ListNode ln26 = new ListNode(5);
        ListNode ln27 = new ListNode(5);
        ln26.next = ln27;
        ln25.next = ln26;
        ln24.next = ln25;
        ln23.next = ln24;
        ln22.next = ln23;
        ln21.next = ln22;
        head2.next = ln21;

        head = head2;
    }

    @Test
    public void testMyMergeTwoSortedLists() {
        MyRemoveDuplicatesFromSortedList myRemoveDuplicatesFromSortedList = new MyRemoveDuplicatesFromSortedList();
        System.out.println(myRemoveDuplicatesFromSortedList.deleteDuplicates(head));
    }


    @Test
    public void testOfficialRemoveDuplicatesFromSortedList() {
        OfficialRemoveDuplicatesFromSortedList officialRemoveDuplicatesFromSortedList = new OfficialRemoveDuplicatesFromSortedList();
        System.out.println(officialRemoveDuplicatesFromSortedList.deleteDuplicates(head));
    }

    @Test
    public void testRankingRemoveDuplicatesFromSortedList() {
        RankingRemoveDuplicatesFromSortedList rankingRemoveDuplicatesFromSortedList = new RankingRemoveDuplicatesFromSortedList();
        System.out.println(rankingRemoveDuplicatesFromSortedList.deleteDuplicates(head));
    }


}
