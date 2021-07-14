public class MergeTwoSortedLists_21 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode temp = l1;
        ListNode prev = l1;
        while (l2 != null){
            if(temp.val < l2.val){
                if(temp != l1){
                    prev = prev.next;
                }if(temp.next == null){
                    ListNode newNode = new ListNode(l2.val);
                    if(prev == temp){
                        temp.next = newNode;
                        prev = temp;
                        temp = newNode;
                        l2 = l2.next;
                        continue;
                    }
                    temp.next = newNode;
                    prev = temp;
                    temp = newNode;
                    l2 = l2.next;
                    continue;
                }
                temp = temp.next;
                continue;
            }
            else {
                ListNode newNode = new ListNode(l2.val);
                if(prev == temp){
                    l1 = newNode;
                    newNode.next = temp;
                    prev = newNode;
                    l2 = l2.next;
                    continue;
                }
                prev.next = newNode;
                newNode.next = temp;
                prev = newNode;
                l2 = l2.next;
            }
        }
        return l1;
    }
}
