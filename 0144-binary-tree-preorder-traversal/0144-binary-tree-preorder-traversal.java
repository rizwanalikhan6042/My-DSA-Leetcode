/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
      List<Integer>ans=new ArrayList<>();
      Stack<TreeNode>st=new Stack<>();
      if(root==null){
        return new ArrayList<>();
      }
      st.push(root);

      while(!st.empty()){
        TreeNode curr=st.pop();
        ans.add(curr.val);
        if(curr.right!=null){
            st.push(curr.right);
        }
        if(curr.left!=null){
            st.push(curr.left);
        }

      }
      return ans;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna