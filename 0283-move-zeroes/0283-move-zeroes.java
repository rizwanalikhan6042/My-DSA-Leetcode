class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int interpos=0;
         for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[interpos]=nums[i];
                interpos++;
            }
         }
         while(interpos<n){
            nums[interpos]=0;
            interpos++;
         }
         return ;
    }
}