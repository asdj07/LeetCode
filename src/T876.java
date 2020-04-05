/**
 * Created by asd on 2020/4/5 17:50.
 *
 * https://leetcode-cn.com/problems/middle-of-the-linked-list/submissions/
 * 876. 链表的中间结点
 */
public class T876 {

    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode index1 = head;
        ListNode index2 = head;
        while(true) {
            if(index2.next != null && index2.next.next != null) {
                index2 = index2.next.next;
            } else {
                if(index2.next != null) {
                    // 有两个中间节点返回第二个
                    index1 = index1.next;
                }
                break;
            }
            index1 = index1.next;
        }
        return index1;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
