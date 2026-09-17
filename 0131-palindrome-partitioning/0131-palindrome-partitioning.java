class Solution {
    public List<List<String>> partition(String s) {
        int n=s.length();
        List<List<String>>ans=new ArrayList<>();
        List<String>path=new ArrayList<>();
        backtrack(s,0,ans,path);
        return ans;
        }
    private void backtrack(String s,int str,List<List<String>>ans,List<String>path){
        if(str==s.length()){
         ans.add(new ArrayList<>(path));
         return;
        }
        for(int i=str;i<s.length();i++){
            if(isPal(s,str,i)){
                String sub=s.substring(str,i+1);
                path.add(sub);
                backtrack(s,i+1,ans,path);
                path.remove(path.size()-1);
            }
        }}
     private boolean isPal(String s,int low,int high){
        while(low<high){
            if(s.charAt(low)!=s.charAt(high)){
                return false;
            }
            low++;high--;
        }
        return true;
     }

    

}
 



 
