class Solution {
    public String removeDuplicates(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int m=sb.length();
            if(m>0&&ch==sb.charAt(m-1)){
                sb.deleteCharAt(m-1);
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}