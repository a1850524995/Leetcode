public class RotateRight {
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0) {  //特解
            return head;
        }
        if (head == null) {//特解
            return head;
        }
        int MOD = 0;
        ListNode p = head;
        while (p != null) {
            p = p.next;
            MOD++;
        }
        int rotate = (MOD - k % MOD) % MOD;//找到偏移量
        if (rotate == 0) {
            return head;
        }
        ListNode cur = head;
        while (rotate > 1) {//找到转置最后一个元素
            cur = cur.next;
            rotate--;

        }
        ListNode fin = cur;
        ListNode newHead = cur.next;//元素的下一个是新头
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = head;//接续起来
        fin.next = null;//之前保存的末尾下一个元素置空
        return newHead;


    }
}
