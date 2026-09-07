class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0){
            return 1;
        }
        int avldigit=9;
        int currChoices=9;
        int totalUniq=10;
        for(int i=2;i<=n&&avldigit>0;i++){
           currChoices =currChoices*avldigit;
            totalUniq+=currChoices;
             avldigit--;
        }
        return totalUniq;
    }
}