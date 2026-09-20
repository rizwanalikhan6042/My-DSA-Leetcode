class Solution {
    public int search(int[] nums, int target) {
//         int n=nums.length;
//         int low=0;
//         int high=n-1;

//         while(low<=high){
//             int mid=low+(high-low)/2;
//             if(nums[mid]==target){
//                 return mid;
//             }
//             if(nums[low]<=nums[mid]){
//                 if(target>=nums[low]&&target<nums[mid]){
// //we already checked that nums[mid] is eq to trgt or not so no need to put equal sign here target<nums[mid] is enough                    
//                     high=mid-1;
//                 }else{
//                     low=mid+1;
//                 }
//             }else{
//                 if(target<=nums[high]&&target>nums[mid]){
//                     low=mid+1;
//                 }else{
//                     high=mid-1;
//                 }
//             }
//         }
//         return -1;

     int n=nums.length;
     int i=0;
     int j=n-1;
     while(i<=j){
        int mid=i+(j-i)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(nums[i]<=nums[mid]){
        if(target>=nums[i]&&target<nums[mid]){
            j=mid-1;
        }else{
            i=mid+1;
        }
        }else{
            if(target>nums[mid]&&target<=nums[j]){
                i=mid+1;

            }else{
                j=mid-1;
            }
        }
     }

return -1;
    }
}