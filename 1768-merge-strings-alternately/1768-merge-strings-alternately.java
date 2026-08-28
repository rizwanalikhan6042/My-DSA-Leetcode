class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        StringBuilder sb=new StringBuilder();
        int i=0;
        for(;i<n&&i<m;i++){
          sb.append(word1.charAt(i));
          sb.append(word2.charAt(i));
  }
      if(i<n){
        while(i<n){
            sb.append(word1.charAt(i));
            i++;
        }
      }
         if(i<m){
            while(i<m){
                sb.append(word2.charAt(i));
                i++;
            }
         }
         return sb.toString();
    }
}