class swapnodesinpairs {
    public ListNode swapPairs(ListNode head) {
       if(head==null || head.next==null)
        return head;
 
    ListNode fakehead = new ListNode(0);
    fakehead.next = head;
 
    ListNode p1 = head;
    ListNode p2 = head.next;
 
    ListNode pre = fakehead;
    while(p1!=null && p2!=null){
        pre.next = p2;
 
        ListNode t = p2.next;
        p2.next = p1;
        pre = p1;
        p1.next = t;
 
        p1 = p1.next;
 
        if(t!=null)
            p2 = t.next;
    }
    return fakehead.next; 
    }
}
