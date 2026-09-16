class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int i=0;
        int j=0;
        HashMap<Character,Integer>map=new HashMap<>();
        int maxlen=0;
        for(int k=0;k<n;k++)
        {
            char ch=s.charAt(k);
            if(map.containsKey(ch)){
                int f=map.get(ch);
                map.put(ch,f+1);
                if(map.get(ch)>2){
                    while(map.get(ch)>2){
                        int bh=map.get(s.charAt(j));
                        map.put(s.charAt(j),bh-1);
                        j++;
                    }
                }
            }else{
                map.put(ch,1);
            }
            
         maxlen=Math.max(maxlen,k-j+1);
        }
return maxlen;
    }
}