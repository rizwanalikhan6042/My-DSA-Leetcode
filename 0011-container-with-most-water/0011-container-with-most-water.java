class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int max=Integer.MIN_VALUE;
        int i=0;
        int j=n-1;
        while(i<j){
           int water=Math.min(height[i],height[j])*(j-i);
           max=Math.max(max,water);
           if(height[i]<height[j]){
            i++;
           }else{
            j--;
           }
        }
       return max;


    }
}