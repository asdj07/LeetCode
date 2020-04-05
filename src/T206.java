/**
 * Created by asd on 2020/4/5 18:00.
 *
 * https://leetcode-cn.com/problems/reverse-linked-list/
 * 206. 反转链表
 *
 */
public class T206 {
    //递归， 每次将尾节点移到最前
    public ListNode reverseList1(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode tail = head;
        ListNode preTail = tail;
        while(tail.next != null) {
            preTail = tail;
            tail = tail.next;
        }
        ListNode newHead = tail;
        preTail.next = null;
        newHead.next = reverseList1(head);
        return newHead;
    }

    //递归
    public ListNode reverseList2(ListNode head) {
        return reverse(null, head);
    }

    private static ListNode reverse(ListNode pre, ListNode cur) {
        if(cur == null) {
            return pre;
        }
        ListNode next = cur.next;
        cur.next = pre;
        return reverse(cur, next);

    }

    //迭代  pre  cur  next
    public ListNode reverseList3(ListNode head) {
        if(head == null) return null;
        ListNode pre = null, cur = head, next = null;
        while(cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }


    public ListNode reverseList4(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode tail = head;
        int size = 0;
        while(tail.next != null) {
            tail = tail.next;
            size++;
        }
        ListNode newHead = tail;
        while(size-- >= 0) {
            int index = size;
            ListNode temp = head;
            while(index-- > 0) {
                temp = temp.next;
            }
            tail.next = temp;
            tail = tail.next;
        }
        tail.next = null;
        return newHead;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
