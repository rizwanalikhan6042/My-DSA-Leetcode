/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
      
        ListNode slow=head;
        ListNode fast=head;
        if(head==null||head.next==null){
            return false;
        }
    //dono condtn lagani hongi bcz it jumps 2 position at once so it will try to do null.next if not putting both cndtn    
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}