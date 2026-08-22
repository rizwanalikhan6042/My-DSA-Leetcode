class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int start=1;
        int end=k;
        int ans[]=new int[n];
        if(k<0){
          k=Math.abs(k);
          start=n-k;
          end=n-1;
        }
        int wndwSum=0;
        for(int i=start;i<=end;i++){
         wndwSum+=code[i];
        }
        for(int i=0;i<n;i++){
            ans[i]=wndwSum;
            wndwSum-=code[start%n];
            start++;
            end++;
            wndwSum+=code[end%n];
            
        }
        return ans;
    }
}