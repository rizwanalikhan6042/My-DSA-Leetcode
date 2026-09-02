class Solution {
    public int reverse(int x) {
        int ld=0;
        long ans=0;
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        while(x!=0){
            ld=x%10;
            ans=ans*10+ld;
            if(ans>max){
                return 0;
            }
            if(ans<min){
                return 0;
            }
            
            x=x/10;
        }
        return (int)ans;
    }
}