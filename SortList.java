class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null&&fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
         }
        prev.next=null;
        ListNode l1=sortList(head);
        ListNode l2=sortList(slow);
        return MergeSort(l1,l2);
    }
    ListNode MergeSort(ListNode l1,ListNode l2)
    {
        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        while(l1!=null&l2!=null)
        {
            if(l1.val<l2.val)
            {
                ans.next=l1;
                l1=l1.next;
            }
            else
            {
                ans.next=l2;
                l2=l2.next;
            }
            ans=ans.next;
            
        }
        if(l1!=null)
        {
            ans.next=l1;
        }
        if(l2!=null)
        {
            ans.next=l2;
        }
        return dummy.next;
    }
}
