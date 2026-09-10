class Solution {
    public String removeDuplicateLetters(String s) {
        int n=s.length();
        String ans="";
        int freq[]=new int[26];
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']=i;
        }
        boolean bar[]=new boolean[26];
        Stack<Character>st=new Stack<>();
        for(int i=0;i<n;i++){
            if(bar[s.charAt(i)-'a']==true){
                continue;
            }
            if(st.empty()||st.peek()<s.charAt(i)){
                st.push(s.charAt(i));
                bar[s.charAt(i)-'a']=true;
            }else{
                if(st.peek()>s.charAt(i)){
                    while(!st.empty()&&st.peek()>s.charAt(i)&&freq[st.peek()-'a']>i){
                    bar[st.peek()-'a']=false;
                    st.pop();
                     
                    }
                    st.push(s.charAt(i));
                    bar[s.charAt(i)-'a']=true;
                }
            }
            

        }
        while(!st.empty()){
                char ch=st.pop();
                ans=ch+ans;
            }
       return ans;
    }
}