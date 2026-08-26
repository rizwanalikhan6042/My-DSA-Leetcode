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
    public ListNode detectCycle(ListNode head) {
        
        ListNode slow=head;
        ListNode fast=head;
        boolean flag=false;
               
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        if(fast==slow){
            flag=true;
//2 cases bnege ya to poori list hi cycle hogi us condtn me slow or fast dono head pr honge ya fir ni ,, ni wali situation me hamesha head ki starting point se doori aur unke meeting point se starting point ki doori same hoti so ham sloow ==fast hote hi break kr denge and now ek ek step aage badayenge jahan ye milenge pakka wahi strting point h
     
            if(slow==head){ 
                return slow;
            }else{
                break;
            }
        }

        }
        if(flag==false){
            return null;
        }
      slow=head;
      while(slow!=fast){
        slow=slow.next;
        fast=fast.next;
      }       
      return slow;
    }
}