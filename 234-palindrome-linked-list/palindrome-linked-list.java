
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev= null;
        ListNode curr= head;
        ListNode after= head;
        while(curr!=null){
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode temp= reverseList(slow.next);
        slow.next=temp;
        ListNode t1=head;
        ListNode t2= temp;
        while(t2!=null){
            if(t1.val!=t2.val) return false;
            t1=t1.next;
            t2=t2.next;
        }
        return true;
    }
}