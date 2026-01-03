
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        if(head==null || head.next==null) return null;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast) break;
        }
         ListNode temp=head;
        while(slow!=temp){
            temp=temp.next;
            if(slow.next==null) return null;
            slow=slow.next;
        }
        return temp;
    }
}