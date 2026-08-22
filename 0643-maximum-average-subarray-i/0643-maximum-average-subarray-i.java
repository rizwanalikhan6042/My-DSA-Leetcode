class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double maxAvg=  -Double.MAX_VALUE;
         long sum=0;
         int j=0;
         for(int i=0;i<n;i++){
          sum+=nums[i];
          double avg=(double) sum/k;
          if(i-j+1==k){
            avg=(double) sum/k;
            maxAvg=Math.max(maxAvg,avg);
          }
         else if(i-j+1>k){
            sum-=nums[j];
            j++;
            avg=(double)sum/k;
             maxAvg=Math.max(maxAvg,avg);
          }
         
         }
         return maxAvg;
    }
}