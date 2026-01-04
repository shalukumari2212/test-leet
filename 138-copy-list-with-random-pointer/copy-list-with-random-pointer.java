
class Solution {
    public Node copyRandomList(Node head) {
        Node head2= new Node(0);
        Node temp2=head2;
        Node temp1=head;

        // deepcopy making
        while(temp1!=null){
            Node h= new Node(temp1.val);
            temp2.next=h;
            temp2=h;
            temp1=temp1.next;
        }
        head2=head2.next;

        // alternate connection;
        temp1=head;
        temp2=head2;
         
        Node temp=new Node(-1);
         
        while(temp1!=null){
            temp.next=temp1;
            temp1=temp1.next;
            temp=temp.next;

            temp.next=temp2;             
            temp2=temp2.next;
            temp=temp.next;
        }

        //assiging random node
        temp1=head;
        temp2=head2;
        
        while(temp1!=null && temp2!=null){
            if(temp1.random==null) temp2.random=null;
            else temp2.random= temp1.random.next;
            temp1=temp2.next;
           if(temp1!=null) temp2=temp1.next;
        }

        // ditach the alternat connection
        temp1=head;
        temp2=head2;
        while(temp1!=null){
            temp1.next=temp2.next;
            temp1=temp1.next;
            if(temp1==null) break;
            temp2.next=temp1.next;
            if(temp2.next==null) break;
            temp2=temp2.next;

        }

        return head2;

    }
}