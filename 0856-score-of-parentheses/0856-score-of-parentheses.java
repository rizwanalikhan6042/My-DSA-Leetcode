class Solution {
    public int scoreOfParentheses(String s) {
        int n=s.length();
        Stack<Integer>st=new Stack<>();
        st.push(0);
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(0);
            }else{
                int x=st.pop();
                int oldscore=st.pop();
                if(x==0){
                    st.push(oldscore+1);
                }else{
                    st.push(2*x+oldscore);
                }
            }
        }
        return st.peek();
    }
}