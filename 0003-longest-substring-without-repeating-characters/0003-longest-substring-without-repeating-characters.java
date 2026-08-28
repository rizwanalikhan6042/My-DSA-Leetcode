class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
       int j=0;
       int max=Integer.MIN_VALUE;
       int len=0;
       if(n==1||n==0){
        return n;
       }
       boolean flag=false;
     for(int i=0;i<n;i++) {
        if(map.containsKey(s.charAt(i))){
           j=Math.max(j,map.get(s.charAt(i))+1);
        }
            map.put(s.charAt(i),i);
        
        
        max=Math.max(i-j+1,max);
     }
     
  return max;
    





    //    for(int i=0;i<n;i++){
    //     if(map.containsKey(s.charAt(i))){
    //         int ind=map.get(s.charAt(i));
    //         if(ind>=start){
    //         start=ind+1;
    //         }
    //     }
    //         map.put(s.charAt(i),i);
            
    //     max=Math.max(max,i-start+1);
    //    }
    // return max;
    }
}