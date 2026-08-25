class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character>st=new Stack<>();
        if(n==1){
            return false;
        }
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }
            else {
                if(!st.empty()&&ch==')'&&st.peek()=='('){
                    st.pop();
                }else if(!st.empty()&&ch=='}'&&st.peek()=='{'){
                    st.pop();
                }else if(!st.empty()&&ch==']'&&st.peek()=='['){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        if(st.empty()){
            return true;
        }else{
            return false;
        }
    }
}