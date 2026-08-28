class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len=flowerbed.length;
        int c=0;
        if((len==1&&flowerbed[0]==0)){
            return true;
        }
        if(flowerbed[0]==0&&flowerbed[1]==0){
            flowerbed[0]=1;
            c++;

        }
        for(int i=1;i<len-1;i++){
         if(flowerbed[i]==0&&flowerbed[i-1]==0&&flowerbed[i+1]==0){
            flowerbed[i]=1;
            c++;
            i++;
         }
         if(i==len-2&&flowerbed[i]==0&&flowerbed[i+1]==0){
            c++;
         }
        }
        if(c>=n){
            return true;
        }
       return false;
    }
}