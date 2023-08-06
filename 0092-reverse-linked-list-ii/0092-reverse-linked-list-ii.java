class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next == null)   return head;

        ListNode dummy_node = new ListNode(0);
        dummy_node.next= head;
        ListNode prev = dummy_node;

        for(int i = 1; i <= left - 1; i++ )     prev = prev.next;
        
        ListNode curr = prev.next;
        

        for(int i = 1; i <= right - left; i++)
        {
            ListNode frwd = curr.next;
            curr.next = frwd.next;
            frwd.next = prev.next;
            prev.next = frwd;
        } 
        return dummy_node.next;
        
    }
} 