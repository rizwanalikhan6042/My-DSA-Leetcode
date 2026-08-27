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
             if(c<10){
                String str=String.valueOf(c);
                chars[j]=str.charAt(0);
                j++;
                len++;
             }else{
               String str=String.valueOf(c);
                int k=0;
                while(k<str.length()){
                    chars[j]=str.charAt(k);
                    k++;
                    j++;
                    len++;
                }
             }
            }
            
            
            c=1;
        }
        }
        chars[j]=chars[i];
            len++;
            j++;
            if(c>1){
             if(c<10){
                String str=String.valueOf(c);
                chars[j]=str.charAt(0);
                j++;
                len++;
             }else{
               String str=String.valueOf(c);
                int k=0;
                while(k<str.length()){
                    chars[j]=str.charAt(k);
                    k++;
                    j++;
                    len++;
                }
             }
            }
            
            
        
        
      return len;
    }
}