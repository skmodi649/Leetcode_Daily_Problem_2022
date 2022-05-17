package May;

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class May_17_Corresponding_Node_in_Clone_tree {
    TreeNode ans;

    public void inorder(TreeNode c,TreeNode target) {
        if (c != null) {
            inorder(c.left, target);
            if (c.val == target.val) {
                ans = c;
            }
            inorder(c.right, target);
        }
    }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target)
    {
        inorder(cloned,target);
        return ans;
    }
}
