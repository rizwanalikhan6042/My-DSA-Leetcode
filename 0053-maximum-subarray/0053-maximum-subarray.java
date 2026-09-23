class Solution {
    public int maxSubArray(int[] nums) {
        // kadane
        int n=nums.length;
        int currMax=0;
        int maxSofar=Integer.MIN_VALUE;
        // if(n==1){
        //     return nums[0];
        // }
        for(int i=0;i<n;i++){
            currMax=Math.max(nums[i],currMax+nums[i]);
            maxSofar=Math.max(currMax,maxSofar);
        }
        return maxSofar;
    }
}