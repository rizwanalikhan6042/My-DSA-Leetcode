class Solution {
    private int gcd(int a, int b){
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
    public String gcdOfStrings(String str1, String str2) {
        int n=str1.length();
        int m=str2.length();
        if(!(str1+str2).equals(str2+str1)){
        return "";
        }
        int ans=gcd(n,m);
        return str1.substring(0,ans);
    }
}