class Solution {
    public int longestValidParentheses(String s) {
       int n=s.length();
       if(n==0||n==1){
        return 0;
       }
       Stack<Integer>st=new Stack<>();
        int maxlen=0;
        st.push(-1);
       for(int i=0;i<n;i++ ){
        char ch=s.charAt(i);
        if(ch=='('){
            st.push(i);
        }
        else{
            st.pop();
            if(st.empty()){
                st.push(i);
            }else{
                maxlen=Math.max(maxlen,i-st.peek());
            }
        }
       }
     return maxlen;
    }
}