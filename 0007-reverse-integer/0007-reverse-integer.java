class Solution {
    public int reverse(int x) {
       long ans=0;
        int ld=0;

       while(x!=0){
        ld=x%10;
        ans=ans*10+ld;
        if(ans>Integer.MAX_VALUE||ans<Integer.MIN_VALUE){
            return 0;
        }
        x=x/10;
       }
       return (int)ans;
    }
}