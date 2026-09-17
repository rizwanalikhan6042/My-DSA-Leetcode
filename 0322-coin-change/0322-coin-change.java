class Solution {
    public int coinChange(int[] coins, int amount) {
        int arr[]=new int[amount+1];
        for(int i=0;i<arr.length;i++){
            arr[i]=amount+1;
        }
        arr[0]=0;
            boolean flag=false;

        for(int i=1;i<=amount;i++){
        int minCoin=amount+1;

            for(int j=0;j<coins.length;j++){
                if(i>=coins[j]){
                    int diff=i-coins[j];
                    minCoin=Math.min(minCoin,1+arr[diff]);
                    flag=true;
                    arr[i]=minCoin;
                }
                
            }
            
        }
        if(arr[amount]<=amount){
            return arr[amount];
        }else{
            return -1;
        }
    }
}