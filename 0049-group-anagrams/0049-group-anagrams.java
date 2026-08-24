class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        HashMap<String,List<String>>map=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch[]=strs[i].toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
   //agar key ni h to key ke liye ek list add kro          
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            //jisky key h wo value add kro
            map.get(key).add(strs[i]);
        }
        return new ArrayList<>(map.values());
//bas values hamare kam ki hen, key to bas grping ke liye use hui hen , use it and throw it
    }
}