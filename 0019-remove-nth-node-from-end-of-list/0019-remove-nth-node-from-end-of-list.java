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
        temp=head;
        if(size==1){
            head=null;
            return head;
        }
        if(position==0){
         head=head.next;
         return head;
        }
        while(position-1>0){
         temp=temp.next;
         position--;
        }
        temp.next=temp.next.next;
        return head;
    }
}