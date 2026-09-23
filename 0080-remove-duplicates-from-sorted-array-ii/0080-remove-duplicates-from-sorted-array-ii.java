class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int ind=2; //2 tak kuch bhi valid rhega 
        for(int i=2;i<n;i++){
            if(nums[i]!=nums[ind-2]){
                nums[ind]=nums[i];
                ind++;
            }
        }
       return ind; }
}