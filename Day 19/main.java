class Solution {
    public ListNode deleteDuplicates(ListNode head) {
       if(head==null||head.next==null)
       return head;
        ListNode left = head;
        ListNode right = head.next;
        int node1=left.val,node2=right.val;
        while(right!=null){
             node1 = left.val;
            node2= right.val;
            if(node1==node2){
                left.next = right.next;
                right=right.next;
            }
            if(node1!=node2){
                left = left.next;
                right = right.next;
            }
           
        }
        return head;
    }
}