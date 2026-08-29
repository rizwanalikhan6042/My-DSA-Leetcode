class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
       int len=flowerbed.length;
       int c=0;
       if(n==0){
        return true;
       }
       if(n==1&&len==1&&flowerbed[0]==0){
        return true;
       }
       if(flowerbed[0]==0&&flowerbed[1]==0){
        flowerbed[0]=1;
        c++;
       }
       for(int i=1;i<len-1;i++){
        if(flowerbed[i]==0){
            if(flowerbed[i-1]==0&&flowerbed[i+1]==0){
                flowerbed[i]=1;
                c++;
            }
        }}
        if(flowerbed[len-1]==0&&flowerbed[len-2]==0){
            flowerbed[len-1]=1;
            c++;
        }
        if(c>=n){
            return true;
        }
        else{
            return false;
        }
       }      
    
}