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
    public ListNode middleNode(ListNode head) {
        ListNode mid = head;
        ListNode temp = head;
        while (temp.next !=null){
            mid = mid.next;
            if(temp.next.next != null)
            temp = temp.next.next;
            else 
                temp = temp.next;
        }
        return mid;
    }
}
