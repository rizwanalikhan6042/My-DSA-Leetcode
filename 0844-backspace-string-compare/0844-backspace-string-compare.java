class Solution {
    public boolean backspaceCompare(String s, String t) {
        int n=s.length();
        int m=t.length();
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<n||i<m;i++){
            if(i<n){
             char ch=s.charAt(i);
             if(ch!='#'){
            sb.append(ch);
         }else{
            if(sb.length()>0){
            sb.deleteCharAt(sb.length()-1);
            
            }

         }
            }
         if(i<m){
         char bh=t.charAt(i);
           if(bh!='#'){
            sb1.append(bh);
         }else{
            if(sb1.length()>0){
            sb1.deleteCharAt(sb1.length()-1);

            }

         }
         }
         
        
        }
        if(sb.toString().equals(sb1.toString())){
            return true;
        }else{
            return false;
        }
    }
}