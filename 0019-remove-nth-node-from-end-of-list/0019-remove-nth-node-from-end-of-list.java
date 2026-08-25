/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        
        int position=size-n;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        temp=dummy;
//head se ek pos phle dummy lene se bht sare edge cases handle ho jynge jisme hame head se ek pos phle khade hone ki need hogi       
        while(position>0){
         temp=temp.next;
         position--;
        }
        temp.next=temp.next.next;
        return dummy.next;
    }
}