class Solution {
    class Pair{
        char ch;
        int count;
        Pair(char ch,int count){
            this.ch=ch;
            this.count=count;
        }
    }
    public String removeDuplicates(String s, int k) {
        int n=s.length();
        Stack<Pair>st=new Stack<>();
   //actually we have to keep record of every char count thats why pair is needed     
        for(int i=0;i<n;i++){
            char curr=s.charAt(i);
          if(st.empty()||st.peek().ch!=curr){
            st.push(new Pair(curr,1));
          }else{
            if(st.peek().ch==curr){
                st.peek().count++;
                if(st.peek().count==k){
                    st.pop();
                }
            }
          }
        }
    StringBuilder ans=new StringBuilder();
    while(!st.empty()){
        Pair currentPair=st.pop();
        for(int i=0;i<currentPair.count;i++){
         ans.append(currentPair.ch);
        }
    }
    return ans.reverse().toString();
     


    }
}