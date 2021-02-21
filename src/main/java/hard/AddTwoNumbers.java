package hard;

/**
 * @author takaibun
 */
public class AddTwoNumbers {
    /**
     * Definition for singly-linked list.
     */
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {
        ListNode ln;
        int sum = l1.val + l2.val + carry;
        int num = sum % 10;
        carry = sum / 10;
        if (l1.next == null && l2.next != null) {
            l1.next = new ListNode(0);
        }
        if (l2.next == null && l1.next != null) {
            l2.next = new ListNode(0);
        }
        if (l1.next == null && l2.next == null) {
            ln = new ListNode(num);
            ln.next = carry > 0 ? new ListNode(carry) : null;

        } else {
            ln = new ListNode(num, addTwoNumbers(l1.next, l2.next, carry));
        }
        return ln;
    }
}
