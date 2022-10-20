class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode curr=head;
        List<Integer> ans=new ArrayList<>();
        while(curr!=null)
        {
            ans.add(curr.val);
            curr=curr.next;
        }
        for(int i=0;i<ans.size()/2;i++)
        {
            if(ans.get(i)!=ans.get(ans.size()-1-i))return false;
            }
        return true;
    }
}


