
public class Solution {
    public int size(ListNode head){
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;

    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        int lenA=size(headA);
        int lenB=size(headB);
       

        if(lenA<lenB){
            int n= lenB-lenA;
            for(int i=1;i<=n;i++){
                temp2=temp2.next;
            }
        }
        if(lenA>lenB){
            int n= lenA-lenB;
            for(int i=1;i<=n;i++){
                temp1=temp1.next;
            }
        }
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;

    }
}