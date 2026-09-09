class Solution {
    public int scoreOfParentheses(String s) {
        int n=s.length();
        Stack<Integer>st=new Stack<>();
        int count=0;
        st.push(0);
        for(int i=0;i<n;i++){
           char ch=s.charAt(i);
           if(ch=='('){
            st.push(0);
           }else{
            int x=st.pop();
             int oldsc=st.pop();
            if(x==0){
                st.push(oldsc+1);
            }else{
                
                st.push(oldsc+2*x);
            }
           }
        }
        return st.peek();
    }
}