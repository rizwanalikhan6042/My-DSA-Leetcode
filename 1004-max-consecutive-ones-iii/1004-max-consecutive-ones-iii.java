class Solution {
    public int longestOnes(int[] nums, int k) {
       int n=nums.length;
       int i=0;
       long zeros=0;
       long len=0;
       long max=0;
       for(int j=0;j<n;j++){
        if(nums[j]==0){
            zeros++;
        }
        
        while(i<n&&zeros>k){
            if(nums[i]==0){
                zeros--;
            }
            i++;
        }
        len=j-i+1;
        max=Math.max(len,max);    
       }


return (int) max;






    //    int max=0;
    //    int zeros=0;

    //    for(int j=0;j<n;j++){
    //     if(nums[j]==0){
    //         zeros++;
    //     }
    //     while(zeros>k){
    //       if(nums[i]==0){
    //         zeros--;
    //       }
    //       i++;
    //     }
    //     max=Math.max(max,j-i+1);
    //    } 
    //    return max;
    }
}