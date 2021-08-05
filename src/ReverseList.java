public class ReverseList {


    public ListNode ReverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode p = null;
        while (slow != null && fast != null){
            slow = slow.next;
            if (fast.next != null){
                fast = fast.next.next;
            }
            if (slow == fast){
                p = slow;
                slow = head;
                break;
            }
        }
        while ( p != null && slow != null){
            p = p.next;
            slow = slow.next;
            if (p == slow) {
                return p;
            }
        }
        return null;

    }
    public static void main(String[] args) {

    }
}


