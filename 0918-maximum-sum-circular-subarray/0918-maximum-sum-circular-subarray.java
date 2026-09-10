class Solution {
    public int maxSubarraySumCircular(int[] nums) {
      int totalSum=nums[0];
      int normalSum=nums[0];
      int circularSum=Integer.MIN_VALUE;
      int currMax=nums[0];
      int currMin=nums[0];
      int minsofar=nums[0];
      
      for(int i=1;i<nums.length;i++){
       currMax=Math.max(nums[i],currMax+nums[i]);
       normalSum=Math.max(normalSum,currMax);
       currMin=Math.min(nums[i],currMin+nums[i]);
       minsofar=Math.min(currMin,minsofar);
       totalSum+=nums[i];
      }  
      if(normalSum<0){
        return normalSum;
      }
      circularSum=totalSum-minsofar;
      return Math.max(normalSum,circularSum);
     
    }
}