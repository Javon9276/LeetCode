package cn.javon.leetcode.easy._083_removeduplicatesfromsortedlist;

public class RankingRemoveDuplicatesFromSortedList {
    /**
     * 和remove duplicates from array 一样思路，一慢一块两个指针
     * 区别是：碰到不一样的时候，i和j都往后走，i连j连不连都行，
     * 碰到等于的时候，i停着不动，j往后走到第一个不是dup的时候，这时候一定要i去连j
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode i = head;
        ListNode j = head.next;
        int valBeforeJ = i.val;

        while (j != null && i != null) {
            if (j.val != valBeforeJ) {
                i = i.next;
            }
            valBeforeJ = j.val;
            j = j.next;
            //这一步是关键，平时i连j没啥区别
            //一旦i停留j往后的时候，i一定要跳去连后面的j
            i.next = j;
        }
        return head;
    }

}
