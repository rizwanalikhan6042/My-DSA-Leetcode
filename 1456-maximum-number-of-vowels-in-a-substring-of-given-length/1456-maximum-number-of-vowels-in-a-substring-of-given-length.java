class Solution {
    private boolean isVowel(Character x){
     if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){
        return true;
     }
     return false;
    }
    public int maxVowels(String s, int k) {
        int n=s.length() ;
        int count=0;
        int max=0;
        int j=0;  //for left
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
       for(int i=k;i<n;i++){
        max=Math.max(max,count);
        if(max==k){
            return k; //isse zyada ni ho skta cnt
        }
        //left wala agr vowel h uska cnt minus kro
        if(isVowel(s.charAt(j))){
            count--;
        }
        j++;
       //right wala agr vowel h uska cnt plus 
        if(isVowel(s.charAt(i))){
            count++;
        }
       }
       max=Math.max(max,count);
   return max;      
    }
}