class Solution {
    public String reverseWords(String s) {
    
       StringBuilder sb=new StringBuilder();
       s=s.trim();
       int n=s.length();
       int j=n-1;
       int ind=0;
       for(int i=n-1;i>=0;i--){
//phla space jiske bad word h uski position tracking
        if(s.charAt(i)==' '&&s.charAt(i+1)!=' '){
            ind=i+1;
        }
   //yani word ke last ch pr hen ham yahan
   //yahan hamne substrng me ind se start kiya ku ki i+1 me to spaces bhi ho skte hen so we already saved the position of start as ind     
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