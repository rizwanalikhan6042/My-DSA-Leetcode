class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int c=1;
        int j=0;
        int len=0;
        int i=0;
        for(;i<n-1;i++){
        if(chars[i]==chars[i+1]){
        c++;

        }else{
            chars[j]=chars[i];
            len++;
            j++;
            if(c>1){
            String str = String.valueOf(c);
                    for (int k = 0; k < str.length(); k++) {
                        chars[j++] = str.charAt(k);
                        len++;
                    }
                  
            }
            
            
            c=1;
        
        }
        }
        chars[j]=chars[i];
            len++;
            j++;
            if(c>1){
             String str = String.valueOf(c);
                    for (int k = 0; k < str.length(); k++) {
                        chars[j++] = str.charAt(k);
                        len++;
                    }
                  
            }
        
        
      return len;
    }
}