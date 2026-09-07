class Solution {
    public String removeDuplicates(String s) {
        int n=s.length();
        // StringBuilder sb=new StringBuilder();
        // for(int i=0;i<n;i++){
        //     char ch=s.charAt(i);
        //     int m=sb.length();
        //     if(m>0&&ch==sb.charAt(m-1)){
        //         sb.deleteCharAt(m-1);
        //     }else{
        //         sb.append(ch);
        //     }
        // }
        // return sb.toString();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(!st.empty()&&st.peek()==s.charAt(i)){
              st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        String ans="";
        while(!st.empty()){
          char ch=st.pop();
          ans=ch+ans;
        }
        return ans;
    }
}