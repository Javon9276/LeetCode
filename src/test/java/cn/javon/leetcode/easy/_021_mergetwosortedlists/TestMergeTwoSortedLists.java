package cn.javon.leetcode.easy._021_mergetwosortedlists;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Javon
 * @since 2018-01-24
 **/
public class TestMergeTwoSortedLists {

    private ListNode ln1;
    private ListNode ln2;

    @Before
    public void initData() {
        System.out.println("init data");
        ln1 = new ListNode(1);
        ListNode ln12 = new ListNode(2);
        ListNode ln13 = new ListNode(4);
        ln12.next = ln13;
        ln1.next = ln12;
        ln2 = new ListNode(1);
        ListNode ln22 = new ListNode(5);
        ListNode ln23 = new ListNode(6);
        ln22.next = ln23;
        ln2.next = ln22;
    }

    @Test
    public void testMyMergeTwoSortedLists() {
        MyMergeTwoSortedLists myMergeTwoSortedLists = new MyMergeTwoSortedLists();
        System.out.println(myMergeTwoSortedLists.mergeTwoLists(ln1, ln2));
    }

    @Test
    public void testExcellentMergeTwoSortedLists() {
        ExcellentMergeTwoSortedLists excellentMergeTwoSortedLists = new ExcellentMergeTwoSortedLists();
        System.out.println(excellentMergeTwoSortedLists.mergeTwoLists(ln1, ln2));
    }

    @Test
    public void testAbnormalMergeTwoSortedLists() {
        AbnormalMergeTwoSortedLists abnormalMergeTwoSortedLists = new AbnormalMergeTwoSortedLists();
        System.out.println(abnormalMergeTwoSortedLists.mergeTwoLists(ln1, ln2));
    }

}
