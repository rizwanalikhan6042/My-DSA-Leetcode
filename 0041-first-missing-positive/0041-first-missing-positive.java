class Solution {
    public int firstMissingPositive(int[] nums) {
    //    APPROACH: Cyclic Sort (First Missing Positive - Hard) 
//     Idea ye hai ki har positive number 'x' (jo 1 se n ke beech hai) ko uske sahi index 'x-1' par swap karke bhej dena hai.
// Agar number out of bounds hai (val > n || val <= 0) ya pehle se 
//  *    sahi jagah par hai (val == i + 1), toh simply aage badh jao (i++).
// Agar number galat jagah hai par valid hai, toh use right index (val - 1) 
//  par baithe element se SWAP karo. BUT duplicate numbers se bachne ke liye 
//   check karo 'val != nums[rind]'. Agar dono same hain toh cross-swap se 
//  bachne ke liye 'i++' kar do.
//  
//  4. Aakhiri me ek simple loop chala kar check karo kaun sa element 
//     'i + 1' ke barabar nahi hai. Jo pehla discrepancy index milega, 
//  wahi hamara 'First Missing Positive' hoga.
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