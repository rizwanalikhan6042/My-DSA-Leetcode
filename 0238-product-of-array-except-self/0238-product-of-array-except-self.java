class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int temp=1;
        ans[0]=temp;
        for(int i=1;i<n;i++){
         ans[i]=nums[i-1]*ans[i-1];
        }
        
        for(int i=n-2;i>=0;i--){
            temp=nums[i+1]*temp;
            ans[i]=ans[i]*temp;
        }
     return ans;
    }
}