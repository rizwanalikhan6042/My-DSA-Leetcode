class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int k=needle.length();
        StringBuilder str=new StringBuilder();
        if(k>n){
            return -1;
        }
        for(int i=0;i<k;i++){
         str.append(haystack.charAt(i));
        }
        if(str.toString().equals(needle)){
            return 0;
        }
        int j=0;
        for(int i=k;i<n;i++){
            str.deleteCharAt(0);
            j++;
            str.append(haystack.charAt(i));
            if(str.toString().equals(needle)){
                return j;
            }
        }
        return -1;
    }
}