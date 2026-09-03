class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
         Arrays.sort(nums);
         long clostSum=nums[0]+nums[1]+nums[n-1];
         
         for(int i=0;i<n-2;i++){
           
           int x=i+1;
           int y=n-1;
           while(x<y){
            long sum=nums[i]+nums[x]+nums[y];
            if((int)sum==target){
                return (int)sum;
            }
            if(Math.abs((int)sum-target)<(Math.abs((int)clostSum-target))){
                clostSum=sum;
            }
            if(sum<target){
                x++;
            }
            if(sum>target){
             y--;
            }
           }
         }
         return (int) clostSum;
    }
}