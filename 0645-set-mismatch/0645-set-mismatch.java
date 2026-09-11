class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int ans[]=new int[2];
        for(int i=0;i<n;i++){
            int val=Math.abs(nums[i]);
            int ind=val-1;
            if(nums[ind]>0){
                nums[ind]=-1*nums[ind];
            }else{
                ans[0]=val;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                ans[1]=i+1;
            }
        }
        return ans;
    }
}