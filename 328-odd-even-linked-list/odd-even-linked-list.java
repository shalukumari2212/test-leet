
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd= new ListNode(0);
        ListNode even= new ListNode(0);
        ListNode temp= head;
        ListNode tempo= odd;
        ListNode tempe= even;
        
        while(temp!=null){
            tempo.next=temp;
            tempo=temp;
            temp=temp.next;
            

            tempe.next=temp;
            if(temp==null) break;
            tempe=temp;
            temp=temp.next;
            
        }
        odd=head;
        even=even.next;
        tempo.next=even;
        return head;
    }
}