class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer>ans=new ArrayList<>();

        for(int i=0;i<n;i++){
            int val=Math.abs(nums[i]);
            int ind=val-1;
            if(nums[ind]>0){
                nums[ind]=-1*nums[ind];
            }

        }
       for(int i=0;i<n;i++){
        if(nums[i]>0){
            ans.add(i+1);
        }
       }       
       return ans;
    }
}