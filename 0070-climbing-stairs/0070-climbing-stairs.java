class Solution {
    public int climbStairs(int n) {
        int ans[]=new int[n+1];
        if(n==1||n==2){ //edge cases
            return n;
        } //notes attached 
        ans[1]=1;ans[2]=2;
        for(int i=3;i<=n;i++){
            ans[i]=ans[i-1]+ans[i-2];
        }
        return ans[n];
    }
}
// Chalo, 5th seedhi (n = 5) ke liye poora dry run ek baar array ke sath table form me dekh lete hain taaki picture ekdum clear ho jaye.
// Humari diary (dp array) ka size hoga 6 (0 se 5 tak index).
// ## Step 1: Diary me shuruat ki values likhna (Base Cases)

// * dp = 1
// * dp = 2

// | Index i (Stair) | 0 | 1 | 2 | 3 | 4 | 5 |
// |---|---|---|---|---|---|---|
// | dp[i] (Ways) | 0 | 1 | 2 | 0 | 0 | 0 |

// ------------------------------
// ## Step 2: Loop ka ghumna (i = 3 se 5 tak)## 1. Jab i = 3 (3rd seedhi ke liye)

// * Kaise aayenge? 2nd seedhi se (1 step) ya 1st seedhi se (2 step).
// * Formula: dp = dp + dp → 2 + 1 = 3
// * Diary update: dp = 3

// ## 2. Jab i = 4 (4th seedhi ke liye)

// * Kaise aayenge? 3rd seedhi se (1 step) ya 2nd seedhi se (2 step).
// * Formula: dp = dp + dp → 3 + 2 = 5
// * Diary update: dp = 5

// ## 3. Jab i = 5 (5th seedhi ke liye - Aapka bataya hua logic! 🎯)

// * Kaise aayenge? 4th seedhi se (1 step) ya 3rd seedhi se (2 step).
// * Formula: dp = dp + dp → 5 + 3 = 8
// * Diary update: dp = 8

// ------------------------------
// ## Final Table (Poori Diary)
// Loop khatam hone ke baad hamari diary aisi dikhegi:

// | Step (i) | Formula (dp[i-1] + dp[i-2]) | Total Ways (dp[i]) |
// |---|---|---|
// | 1 | Base Case | 1 |
// | 2 | Base Case | 2 |
// | 3 | 2 + 1 | 3 |
// | 4 | 3 + 2 | 5 |
// | 5 | 5 + 3 | 8 🎉 |

// Program end me dp return karega, jo ki hai 8.
// Maza aaya? Ab aap dynamic programming ka basic logic samajh chuke hain. Kya hum ab Space Optimization seekhein (jisme array ki zaroorat hi nahi padti aur memory bachti hai), ya fir Coin Change par wapas chalein?

