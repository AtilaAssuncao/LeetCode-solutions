/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode emptyNode = new ListNode(0);
        ListNode currentNode = new ListNode(0);
        ListNode result = currentNode;
        while (emptyNode != l1 || emptyNode != l2) {
            int sum = l1.val + l2.val + carry;
            carry = sum / 10;
            currentNode = (currentNode.next = new ListNode(sum %= 10));
            l1 = null != l1.next ? l1.next : emptyNode;
            l2 = null != l2.next ? l2.next : emptyNode;
        }
        if (carry == 1)
            currentNode.next = new ListNode(carry);
        
        return result.next;
    }
}