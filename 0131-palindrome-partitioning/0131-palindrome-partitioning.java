class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>ans=new ArrayList<>();
        List<String>path=new ArrayList<>();
        backtrack(s,0,path,ans);
        return ans;
    }
    private void backtrack(String s,int start,List<String>path,List<List<String>>ans){
        if(start>=s.length()){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=start;i<s.length();i++){
            if(isPal(s,start,i)){
            String sub=s.substring(start,i+1);
            path.add(sub);
            backtrack(s,i+1,path,ans);
            path.remove(path.size()-1);
            }
        }}
        private boolean isPal(String s,int low,int high){
            while(low<high){
           if(s.charAt(low)!=s.charAt(high)){
                return false;
            }
            low++;
            high--;
            }
            return true;
        }
}
    
