class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;
       int i=0;
       while(i<n){
        if(nums[i]>n-1||nums[i]<0||nums[i]==i){
         i++;continue;
        }
        int val=Math.abs(nums[i]);
        int rind=val;
        if(val!=nums[rind]){
            int temp=nums[i];
            nums[i]=nums[rind];
            nums[rind]=temp;
        }
        else{
            i++;
        }
       }
        for(i=0;i<n;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return n;
    }
}