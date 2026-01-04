
class Solution {
    // public int number(String s){
    //     int num=Integer.parseInt(s);
    //     int pow=1;
    //     int sum=0;
    //     while(num>0){
    //         int rem= num%10;
    //         sum= sum+ (pow*rem);
    //         num=num/10;
    //         pow=pow*2;
    //     }
    //     return sum;
    // }
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        int ans=0;
        while(temp!=null){
            ans=ans*2+temp.val;
            temp=temp.next;
        }
        return ans;

        // String s="";
        // while(temp!=null){
        //     s+=temp.val;
        //     temp=temp.next;
        // }   
        // return  number(s);
    }
}