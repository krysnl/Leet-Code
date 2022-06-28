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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        String x = "";
        String y = "";
        while (temp != null){
            x = x+temp.val;
            y = temp.val+y;
            temp = temp.next;
        }
        
        return x.equals(y);
    }
}
