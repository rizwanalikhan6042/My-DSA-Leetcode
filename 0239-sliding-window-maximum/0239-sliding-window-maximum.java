class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int ans[]=new int[n-k+1];
        int j=0;
        Deque<Integer>deq=new ArrayDeque<>();
        if(n==0||k==0){
            return new int[0];
        }
        int ind=0;
        for(int i=0;i<n;i++){
            if(!deq.isEmpty()&&deq.peekFirst()<i-k+1){
                deq.pollFirst();
            }
            while(!deq.isEmpty()&&nums[deq.peekLast()]<nums[i]){
                deq.pollLast();
            }
            deq.offerLast(i);
            if(i>=k-1){
             ans[ind]=nums[deq.peekFirst()];
             ind++;
            }
        }
        return ans;
    }
}