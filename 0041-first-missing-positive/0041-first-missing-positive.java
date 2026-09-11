class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n){
         int val=nums[i];
         if(val>n||val<=0||val==i+1){
            i++;
            continue;
         }
         int rind=val-1;
         if(val!=nums[rind]){
            int temp=nums[i];
            nums[i]=nums[rind];
            nums[rind]=temp;
         }else{
            i++;
         }


        }
        for(i=0;i<n;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return n+1;
    }
}