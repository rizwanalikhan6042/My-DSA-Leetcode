class Solution {
    private boolean isVowel(Character a){
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        int n=s.length();
        int i=0;
        int j=n-1;
        char[]chars=s.toCharArray();
        while(i<j){
            char ch1=chars[i];
            char ch2=chars[j];
            
            if(isVowel(ch1)){
                while(i<j&&!isVowel(chars[j])){
                    j--;
                }
            }
            if(isVowel(ch2)){
                while(i<j&&!isVowel(chars[i])){
                    i++;
                }
            }
            if(isVowel(chars[i])&&isVowel(chars[j])){
                char temp=chars[i];
                chars[i]=chars[j];
                chars[j]=temp;
            }
            i++;
            j--;
        }
        return new String(chars);
    }
}