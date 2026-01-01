
class Solution {
    public void recoverTree(TreeNode root) {
        TreeNode curr= root;
        TreeNode prev= null;
        TreeNode prevprev=null;
        List<TreeNode>l= new ArrayList<>();
        while(curr!=null){
            if(curr.left!=null){
                TreeNode pred= curr.left;
                while(pred.right!=null && pred.right!=curr) pred=pred.right;
                if(pred.right==null){
                    pred.right=curr;
                    curr=curr.left;
                }
                if(pred.right==curr){
                    pred.right=null;
                    //visit
                    if(prev!=null && prevprev!=null){
                        if(prev.val<curr.val && prev.val<prevprev.val) l.add(prev);
                        if(prev.val>curr.val && prev.val>prevprev.val) l.add(prev);
                    }
                    else if(prev!=null && prev.val>curr.val) l.add(prev);
                    
                    prevprev=prev;
                    prev=curr;
                    curr=curr.right;
                }
            }
        
        else{
                //visit
            if(prev!=null && prevprev!=null){
                if(prev.val<curr.val && prev.val<prevprev.val) l.add(prev);
                if(prev.val>curr.val && prev.val>prevprev.val) l.add(prev);
            } 
            else if(prev!=null && prev.val>curr.val) l.add(prev); 
            prevprev=prev;
            prev=curr;
            curr=curr.right;
        }
        }
    if(prev.val<prevprev.val) l.add(prev);
    TreeNode first= l.get(0);
    TreeNode second= l.get(l.size()-1);
    int temp= first.val;
    first.val= second.val;
    second.val=temp;

    }
    
}