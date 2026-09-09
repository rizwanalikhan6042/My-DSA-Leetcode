class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n=nums.length;
        int c=0; //for tracking dist
        boolean flag=false; //for tracking 1's
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                c++;
            }else{
               if(flag==true&&c<k){
                return false;
               }
               else{
                flag=true;
                c=0;
               }
            }
        }
        return true;
    }
}