class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        Arrays.sort(strs);
        int len1=strs[0].length();
        int len2=strs[n-1].length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<len1&&i<len2;i++){
          if(strs[0].charAt(i)==strs[n-1].charAt(i)){
            sb.append(strs[0].charAt(i));
          }else{
            break;
          }
        }
        return sb.toString();
    }
}