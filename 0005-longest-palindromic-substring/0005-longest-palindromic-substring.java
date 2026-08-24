class Solution {
    int maxstart=0,maxlen=0;
   private void centerAround(Integer i, Integer j,String s){
    int n=s.length();
    while(i>=0&&j<n&&s.charAt(i)==s.charAt(j)){
        i--;
        j++;
    }
     int currlen=j-i-1;
     if(currlen>maxlen){
        maxlen=currlen;
        maxstart=i+1;
     }
   }
    public String longestPalindrome(String s) {
        int n=s.length();
       
       
       for(int i=0;i<n;i++){
          centerAround(i-1,i+1,s);
        centerAround(i,i+1,s);
         
        
       
       }
      
       return s.substring(maxstart,maxlen+maxstart);     
    }
}