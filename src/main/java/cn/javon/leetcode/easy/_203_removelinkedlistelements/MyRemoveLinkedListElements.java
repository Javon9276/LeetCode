package cn.javon.leetcode.easy._203_removelinkedlistelements;

/**
 * @author Javon
 * @since 2018-04-03
 **/
public class MyRemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        ListNode correct = new ListNode(0);//定义一个新节点，next指向head
        correct.next = head;
        ListNode cur = correct;
        while (cur.next != null) {//从head开始判断
            if (cur.next.val == val) {//如果相等，则删除
                cur.next = cur.next.next; //保证被删除节点的前一个节点的next指向下一个节点
            } else {
                cur = cur.next;   //指针移动
            }
        }
        return correct.next;//返回的时候从head开始返回
    }

}
