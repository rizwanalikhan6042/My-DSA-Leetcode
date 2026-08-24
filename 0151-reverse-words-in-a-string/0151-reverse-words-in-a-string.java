class Solution {
    public String reverseWords(String s) {
    
       StringBuilder sb=new StringBuilder();
       s=s.trim();
       int n=s.length();
       int j=n-1;
       int ind=0;
       for(int i=n-1;i>=0;i--){
        if(s.charAt(i)==' '&&s.charAt(i+1)!=' '){
            ind=i+1;
        }
        if(s.charAt(i)==' '&&i>0&&s.charAt(i-1)!=' '){
            String str=s.substring(ind,j+1);
            sb.append(str+" ");

            j=i-1;
        }
        if(i==0){
            String str=s.substring(0,j+1);
            sb.append(str);
        }
       } 
       return sb.toString().trim();
    }
}