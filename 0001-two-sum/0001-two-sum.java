class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int ind=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<n;i++){
            if(map.containsKey(target-nums[i])&&
            map.get(target-nums[i])!=i
            ){
               
                int x=map.get(target-nums[i]);
                return new int[]{i,x};
            }
        }
        return new int[]{};
    }
}