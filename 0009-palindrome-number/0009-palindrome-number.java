class Solution {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        int n=s.length();
        int j=n-1;
        for(int i=0;i<n;i++){
          if(s.charAt(i)!=s.charAt(j)){
            return false;
          }
          j--;
        }
        return true;
    }
}