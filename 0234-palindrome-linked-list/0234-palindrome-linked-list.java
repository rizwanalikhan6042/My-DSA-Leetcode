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
    public boolean isPalindrome(ListNode head) {
        //O(1) space cmplx
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //slow is on the middle now 
        ListNode prev=null;
        ListNode curr=slow.next;
        ListNode next=slow;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //now prev is on last node
        ListNode firstHead=head;
        ListNode secHead=prev;

        while(secHead!=null){
            if(firstHead.val!=secHead.val){
                return false;
            }else{
                firstHead=firstHead.next;
                secHead=secHead.next;
            }
        }
        return true;


        //O(N) space cmplx
        // ListNode temp=head;
        // List<Integer>arr=new ArrayList<>();
        // while(temp!=null){
        //    arr.add(temp.val);
        //    temp=temp.next;
        // }
        // int i=0;
        // int j=arr.size()-1;
        // while(i<j){
        //   if(arr.get(i)!=arr.get(j)){
        //     return false;
        //   }
        //   i++;
        //   j--;
        // }
        // return true;
    }
}