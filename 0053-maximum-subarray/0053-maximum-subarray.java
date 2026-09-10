class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int currMax=nums[0];
        int maxsofar=nums[0];
        //kadane algo
        for(int i=1;i<n;i++){
            currMax=Math.max(nums[i],currMax+nums[i]);
            maxsofar=Math.max(maxsofar,currMax);

        }
        return maxsofar;
    }
}