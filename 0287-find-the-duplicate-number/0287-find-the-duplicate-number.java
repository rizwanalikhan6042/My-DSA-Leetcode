class Solution {
    public int findDuplicate(int[] nums) {
    int tor=nums[0];
    int hare=nums[0];
 //samjh lo cycle bn rhi h link list wali ab 
 //isme tor hare algo lagega , phle cycle findount krni h fir dplicate   
    do{
        tor=nums[tor];
        hare=nums[nums[hare]];
      }while(tor!=hare);
        tor=nums[0];
        while(tor!=hare){
            tor=nums[tor];
            hare=nums[hare];
    }
    return tor;
    }
}