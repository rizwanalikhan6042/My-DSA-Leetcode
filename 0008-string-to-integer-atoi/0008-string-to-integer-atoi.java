class Solution {
    public int myAtoi(String s) {
       s=s.trim();
       int n=s.length();
       StringBuilder sb=new StringBuilder();
       boolean flag=false;
       int i=0;
       long ans=0;
       if(s.length()==0){
        return 0;
       }
       if(s.charAt(0)=='+'||s.charAt(0)=='-'){
        sb.append(s.charAt(0));
        i++;
       } 
       for(;i<n;i++){
        char ch=s.charAt(i);
        if(ch<'0'||ch>'9'){
            break;
        }
        if(flag==false&&ch=='0'){
            continue;
        }
        
        if(ch>='1'&&ch<='9'){
         sb.append(ch);
         flag=true;

        }
        if(flag==true&&ch=='0'){
            sb.append(ch);
        }
      if(sb.toString().replace("+","").replace("-","").length()>10){
      if(sb.toString().charAt(0)=='-'){
        return Integer.MIN_VALUE;
      }else{
        return Integer.MAX_VALUE;
      }
      }
       }
       String res=sb.toString().trim();
       if(res.equals("")||res.equals("+")||res.equals("-")){
        return 0;
       }
       int len=res.replace("+","").replace("-","").length();
       int j=0;
       if(res.charAt(0)=='+'||res.charAt(0)=='-'){
        j++;
       }
       for(;j<res.length();j++){
        ans=ans*10+(res.charAt(j)-'0');
        if(res.charAt(0)=='-'&& -ans<=Integer.MIN_VALUE){
           return Integer.MIN_VALUE;
        }
        if(res.charAt(0)!='-' && ans>=Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
       }
        if(res.charAt(0)=='-'){
            ans=-ans;
        }
       
       return (int)ans;
    }
}