class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        List<Integer>ans=new ArrayList<>();

        for(int i=0;i<n;i++){
            //  Current element ki absolute (positive) value nikaali
            // Kyunki pichle steps me koi element negative ho chuka ho sakta hai
            int val=Math.abs(nums[i]);
//  Is value ke liye sahi index dhoonda (0-indexed array ke hisab se         
            int ind=(val)-1;
//Agar is index par value abhi bhi positive hai,
//iska matlab hum is index (yaani is ghar) par pehli baar aaye hain.        // Isko negative mark kar do, taaki yaad rahe hum yahan aa chuke hain (Taala laga diya)    
            if(nums[ind]>0){
                nums[ind]=-1*nums[ind];
            }else{
// DUPLICATE FOUND: Agar value pehle se hi negative mili,
// iska matlab koi doosra element hume fir se isi index par bhej raha hai! // To hum samajh gaye ki 'val' hi duplicate hai, isko answer me add kar do               
                ans.add(val);
            }
        }
        return ans;

    }
}